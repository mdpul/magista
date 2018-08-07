/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.magista.domain.tables;


import com.rbkmoney.magista.domain.Keys;
import com.rbkmoney.magista.domain.Mst;
import com.rbkmoney.magista.domain.enums.FailureClass;
import com.rbkmoney.magista.domain.enums.InvoiceEventType;
import com.rbkmoney.magista.domain.enums.InvoicePaymentStatus;
import com.rbkmoney.magista.domain.tables.records.PaymentEventRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PaymentEvent extends TableImpl<PaymentEventRecord> {

    private static final long serialVersionUID = 1818193459;

    /**
     * The reference instance of <code>mst.payment_event</code>
     */
    public static final PaymentEvent PAYMENT_EVENT = new PaymentEvent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PaymentEventRecord> getRecordType() {
        return PaymentEventRecord.class;
    }

    /**
     * The column <code>mst.payment_event.id</code>.
     */
    public final TableField<PaymentEventRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('mst.payment_event_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>mst.payment_event.event_id</code>.
     */
    public final TableField<PaymentEventRecord, Long> EVENT_ID = createField("event_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>mst.payment_event.event_created_at</code>.
     */
    public final TableField<PaymentEventRecord, LocalDateTime> EVENT_CREATED_AT = createField("event_created_at", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>mst.payment_event.event_type</code>.
     */
    public final TableField<PaymentEventRecord, InvoiceEventType> EVENT_TYPE = createField("event_type", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.rbkmoney.magista.domain.enums.InvoiceEventType.class), this, "");

    /**
     * The column <code>mst.payment_event.invoice_id</code>.
     */
    public final TableField<PaymentEventRecord, String> INVOICE_ID = createField("invoice_id", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>mst.payment_event.payment_id</code>.
     */
    public final TableField<PaymentEventRecord, String> PAYMENT_ID = createField("payment_id", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>mst.payment_event.payment_status</code>.
     */
    public final TableField<PaymentEventRecord, InvoicePaymentStatus> PAYMENT_STATUS = createField("payment_status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.rbkmoney.magista.domain.enums.InvoicePaymentStatus.class), this, "");

    /**
     * The column <code>mst.payment_event.payment_operation_failure_class</code>.
     */
    public final TableField<PaymentEventRecord, FailureClass> PAYMENT_OPERATION_FAILURE_CLASS = createField("payment_operation_failure_class", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.rbkmoney.magista.domain.enums.FailureClass.class), this, "");

    /**
     * The column <code>mst.payment_event.payment_external_failure</code>.
     */
    public final TableField<PaymentEventRecord, String> PAYMENT_EXTERNAL_FAILURE = createField("payment_external_failure", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>mst.payment_event.payment_external_failure_reason</code>.
     */
    public final TableField<PaymentEventRecord, String> PAYMENT_EXTERNAL_FAILURE_REASON = createField("payment_external_failure_reason", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>mst.payment_event.payment_fee</code>.
     */
    public final TableField<PaymentEventRecord, Long> PAYMENT_FEE = createField("payment_fee", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>mst.payment_event.payment_provider_fee</code>.
     */
    public final TableField<PaymentEventRecord, Long> PAYMENT_PROVIDER_FEE = createField("payment_provider_fee", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>mst.payment_event.payment_external_fee</code>.
     */
    public final TableField<PaymentEventRecord, Long> PAYMENT_EXTERNAL_FEE = createField("payment_external_fee", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>mst.payment_event.payment_domain_revision</code>.
     */
    public final TableField<PaymentEventRecord, Long> PAYMENT_DOMAIN_REVISION = createField("payment_domain_revision", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>mst.payment_event.payment_short_id</code>.
     */
    public final TableField<PaymentEventRecord, String> PAYMENT_SHORT_ID = createField("payment_short_id", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>mst.payment_event.payment_provider_id</code>.
     */
    public final TableField<PaymentEventRecord, Integer> PAYMENT_PROVIDER_ID = createField("payment_provider_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>mst.payment_event.payment_terminal_id</code>.
     */
    public final TableField<PaymentEventRecord, Integer> PAYMENT_TERMINAL_ID = createField("payment_terminal_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>mst.payment_event</code> table reference
     */
    public PaymentEvent() {
        this("payment_event", null);
    }

    /**
     * Create an aliased <code>mst.payment_event</code> table reference
     */
    public PaymentEvent(String alias) {
        this(alias, PAYMENT_EVENT);
    }

    private PaymentEvent(String alias, Table<PaymentEventRecord> aliased) {
        this(alias, aliased, null);
    }

    private PaymentEvent(String alias, Table<PaymentEventRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Mst.MST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PaymentEventRecord, Long> getIdentity() {
        return Keys.IDENTITY_PAYMENT_EVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PaymentEventRecord> getPrimaryKey() {
        return Keys.PAYMENT_EVENT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PaymentEventRecord>> getKeys() {
        return Arrays.<UniqueKey<PaymentEventRecord>>asList(Keys.PAYMENT_EVENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PaymentEventRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PaymentEventRecord, ?>>asList(Keys.PAYMENT_EVENT__PAYMENT_EVENT_INVOICE_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentEvent as(String alias) {
        return new PaymentEvent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PaymentEvent rename(String name) {
        return new PaymentEvent(name, null);
    }
}