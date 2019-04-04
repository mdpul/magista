package com.rbkmoney.magista.event.impl.handler;

import com.rbkmoney.damsel.domain.FinalCashFlowPosting;
import com.rbkmoney.damsel.payment_processing.InvoiceChange;
import com.rbkmoney.damsel.payment_processing.InvoicePaymentChange;
import com.rbkmoney.geck.common.util.TypeUtil;
import com.rbkmoney.machinegun.eventsink.MachineEvent;
import com.rbkmoney.magista.domain.enums.InvoiceEventType;
import com.rbkmoney.magista.domain.tables.pojos.PaymentEvent;
import com.rbkmoney.magista.event.ChangeType;
import com.rbkmoney.magista.event.Handler;
import com.rbkmoney.magista.event.Processor;
import com.rbkmoney.magista.service.PaymentService;
import com.rbkmoney.magista.util.DamselUtil;
import com.rbkmoney.magista.util.FeeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class InvoicePaymentCashFlowChangedEventHandler implements Handler<InvoiceChange, MachineEvent> {

    private final PaymentService paymentService;

    @Autowired
    public InvoicePaymentCashFlowChangedEventHandler(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public Processor handle(InvoiceChange change, MachineEvent machineEvent) {

        PaymentEvent paymentEvent = new PaymentEvent();
        paymentEvent.setEventType(InvoiceEventType.INVOICE_PAYMENT_CASH_FLOW_CHANGED);
        //TODO add sequence
//        paymentEvent.setEventId(event.getId());
        paymentEvent.setEventCreatedAt(TypeUtil.stringToLocalDateTime(machineEvent.getCreatedAt()));
        paymentEvent.setInvoiceId(machineEvent.getSourceId());

        InvoicePaymentChange invoicePaymentChange = change.getInvoicePaymentChange();
        paymentEvent.setPaymentId(invoicePaymentChange.getId());

        List<FinalCashFlowPosting> finalCashFlowPostings = invoicePaymentChange
                .getPayload()
                .getInvoicePaymentCashFlowChanged()
                .getCashFlow();

        Map<FeeType, Long> fees = DamselUtil.getFees(finalCashFlowPostings);
        paymentEvent.setPaymentAmount(fees.getOrDefault(FeeType.AMOUNT, 0L));
        paymentEvent.setPaymentFee(fees.getOrDefault(FeeType.FEE, 0L));
        paymentEvent.setPaymentExternalFee(fees.getOrDefault(FeeType.EXTERNAL_FEE, 0L));
        paymentEvent.setPaymentProviderFee(fees.getOrDefault(FeeType.PROVIDER_FEE, 0L));

        return () -> paymentService.savePaymentChange(paymentEvent);
    }

    @Override
    public ChangeType getChangeType() {
        return ChangeType.INVOICE_PAYMENT_CASH_FLOW_CHANGED;
    }
}
