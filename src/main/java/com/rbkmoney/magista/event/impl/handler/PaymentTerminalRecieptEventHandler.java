package com.rbkmoney.magista.event.impl.handler;

import com.rbkmoney.damsel.payment_processing.InvoiceChange;
import com.rbkmoney.damsel.payment_processing.InvoicePaymentChange;
import com.rbkmoney.damsel.user_interaction.PaymentTerminalReceipt;
import com.rbkmoney.geck.common.util.TypeUtil;
import com.rbkmoney.machinegun.eventsink.MachineEvent;
import com.rbkmoney.magista.domain.enums.InvoiceEventType;
import com.rbkmoney.magista.domain.tables.pojos.PaymentEvent;
import com.rbkmoney.magista.event.ChangeType;
import com.rbkmoney.magista.event.Handler;
import com.rbkmoney.magista.event.Processor;
import com.rbkmoney.magista.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentTerminalRecieptEventHandler implements Handler<InvoiceChange, MachineEvent> {

    private final PaymentService paymentService;

    @Autowired
    public PaymentTerminalRecieptEventHandler(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public Processor handle(InvoiceChange change, MachineEvent machineEvent) {

        PaymentEvent paymentEvent = new PaymentEvent();
        paymentEvent.setEventId(machineEvent.getEventId());
        paymentEvent.setEventType(InvoiceEventType.PAYMENT_TERMINAL_RECIEPT);
        paymentEvent.setEventCreatedAt(TypeUtil.stringToLocalDateTime(machineEvent.getCreatedAt()));
        paymentEvent.setInvoiceId(machineEvent.getSourceId());

        InvoicePaymentChange invoicePaymentChange = change.getInvoicePaymentChange();

        String paymentId = invoicePaymentChange.getId();
        paymentEvent.setPaymentId(paymentId);

        PaymentTerminalReceipt paymentTerminalReceipt = invoicePaymentChange
                .getPayload()
                .getInvoicePaymentSessionChange()
                .getPayload()
                .getSessionInteractionRequested()
                .getInteraction()
                .getPaymentTerminalReciept();

        paymentEvent.setPaymentShortId(paymentTerminalReceipt.getShortPaymentId());

        return () -> paymentService.savePaymentChange(paymentEvent);
    }

    @Override
    public ChangeType getChangeType() {
        return ChangeType.INVOICE_PAYMENT_TERMINAL_RECIEPT;
    }
}
