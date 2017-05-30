/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.magista.domain.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Payment implements Serializable {

    private static final long serialVersionUID = 391241051;

    private String        paymentId;
    private Long          eventId;
    private String        invoiceId;
    private String        merchantId;
    private Integer       shopId;
    private String        customerId;
    private String        maskedPan;
    private String        status;
    private Long          amount;
    private Long          fee;
    private String        currencyCode;
    private String        paymentSystem;
    private Integer       countryId;
    private Integer       cityId;
    private String        ip;
    private LocalDateTime createdAt;
    private LocalDateTime changedAt;
    private String        phoneNumber;
    private String        email;
    private String        token;
    private String        sessionId;
    private String        bin;
    private String        paymentTool;
    private String        failureCode;
    private String        failureDescription;
    private byte[]        context;

    public Payment() {}

    public Payment(Payment value) {
        this.paymentId = value.paymentId;
        this.eventId = value.eventId;
        this.invoiceId = value.invoiceId;
        this.merchantId = value.merchantId;
        this.shopId = value.shopId;
        this.customerId = value.customerId;
        this.maskedPan = value.maskedPan;
        this.status = value.status;
        this.amount = value.amount;
        this.fee = value.fee;
        this.currencyCode = value.currencyCode;
        this.paymentSystem = value.paymentSystem;
        this.countryId = value.countryId;
        this.cityId = value.cityId;
        this.ip = value.ip;
        this.createdAt = value.createdAt;
        this.changedAt = value.changedAt;
        this.phoneNumber = value.phoneNumber;
        this.email = value.email;
        this.token = value.token;
        this.sessionId = value.sessionId;
        this.bin = value.bin;
        this.paymentTool = value.paymentTool;
        this.failureCode = value.failureCode;
        this.failureDescription = value.failureDescription;
        this.context = value.context;
    }

    public Payment(
        String        paymentId,
        Long          eventId,
        String        invoiceId,
        String        merchantId,
        Integer       shopId,
        String        customerId,
        String        maskedPan,
        String        status,
        Long          amount,
        Long          fee,
        String        currencyCode,
        String        paymentSystem,
        Integer       countryId,
        Integer       cityId,
        String        ip,
        LocalDateTime createdAt,
        LocalDateTime changedAt,
        String        phoneNumber,
        String        email,
        String        token,
        String        sessionId,
        String        bin,
        String        paymentTool,
        String        failureCode,
        String        failureDescription,
        byte[]        context
    ) {
        this.paymentId = paymentId;
        this.eventId = eventId;
        this.invoiceId = invoiceId;
        this.merchantId = merchantId;
        this.shopId = shopId;
        this.customerId = customerId;
        this.maskedPan = maskedPan;
        this.status = status;
        this.amount = amount;
        this.fee = fee;
        this.currencyCode = currencyCode;
        this.paymentSystem = paymentSystem;
        this.countryId = countryId;
        this.cityId = cityId;
        this.ip = ip;
        this.createdAt = createdAt;
        this.changedAt = changedAt;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.token = token;
        this.sessionId = sessionId;
        this.bin = bin;
        this.paymentTool = paymentTool;
        this.failureCode = failureCode;
        this.failureDescription = failureDescription;
        this.context = context;
    }

    public String getPaymentId() {
        return this.paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public Long getEventId() {
        return this.eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getInvoiceId() {
        return this.invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getMaskedPan() {
        return this.maskedPan;
    }

    public void setMaskedPan(String maskedPan) {
        this.maskedPan = maskedPan;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getAmount() {
        return this.amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getFee() {
        return this.fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getPaymentSystem() {
        return this.paymentSystem;
    }

    public void setPaymentSystem(String paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public Integer getCountryId() {
        return this.countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getCityId() {
        return this.cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getChangedAt() {
        return this.changedAt;
    }

    public void setChangedAt(LocalDateTime changedAt) {
        this.changedAt = changedAt;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getBin() {
        return this.bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getPaymentTool() {
        return this.paymentTool;
    }

    public void setPaymentTool(String paymentTool) {
        this.paymentTool = paymentTool;
    }

    public String getFailureCode() {
        return this.failureCode;
    }

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    public String getFailureDescription() {
        return this.failureDescription;
    }

    public void setFailureDescription(String failureDescription) {
        this.failureDescription = failureDescription;
    }

    public byte[] getContext() {
        return this.context;
    }

    public void setContext(byte... context) {
        this.context = context;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Payment other = (Payment) obj;
        if (paymentId == null) {
            if (other.paymentId != null)
                return false;
        }
        else if (!paymentId.equals(other.paymentId))
            return false;
        if (eventId == null) {
            if (other.eventId != null)
                return false;
        }
        else if (!eventId.equals(other.eventId))
            return false;
        if (invoiceId == null) {
            if (other.invoiceId != null)
                return false;
        }
        else if (!invoiceId.equals(other.invoiceId))
            return false;
        if (merchantId == null) {
            if (other.merchantId != null)
                return false;
        }
        else if (!merchantId.equals(other.merchantId))
            return false;
        if (shopId == null) {
            if (other.shopId != null)
                return false;
        }
        else if (!shopId.equals(other.shopId))
            return false;
        if (customerId == null) {
            if (other.customerId != null)
                return false;
        }
        else if (!customerId.equals(other.customerId))
            return false;
        if (maskedPan == null) {
            if (other.maskedPan != null)
                return false;
        }
        else if (!maskedPan.equals(other.maskedPan))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        }
        else if (!status.equals(other.status))
            return false;
        if (amount == null) {
            if (other.amount != null)
                return false;
        }
        else if (!amount.equals(other.amount))
            return false;
        if (fee == null) {
            if (other.fee != null)
                return false;
        }
        else if (!fee.equals(other.fee))
            return false;
        if (currencyCode == null) {
            if (other.currencyCode != null)
                return false;
        }
        else if (!currencyCode.equals(other.currencyCode))
            return false;
        if (paymentSystem == null) {
            if (other.paymentSystem != null)
                return false;
        }
        else if (!paymentSystem.equals(other.paymentSystem))
            return false;
        if (countryId == null) {
            if (other.countryId != null)
                return false;
        }
        else if (!countryId.equals(other.countryId))
            return false;
        if (cityId == null) {
            if (other.cityId != null)
                return false;
        }
        else if (!cityId.equals(other.cityId))
            return false;
        if (ip == null) {
            if (other.ip != null)
                return false;
        }
        else if (!ip.equals(other.ip))
            return false;
        if (createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!createdAt.equals(other.createdAt))
            return false;
        if (changedAt == null) {
            if (other.changedAt != null)
                return false;
        }
        else if (!changedAt.equals(other.changedAt))
            return false;
        if (phoneNumber == null) {
            if (other.phoneNumber != null)
                return false;
        }
        else if (!phoneNumber.equals(other.phoneNumber))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        }
        else if (!email.equals(other.email))
            return false;
        if (token == null) {
            if (other.token != null)
                return false;
        }
        else if (!token.equals(other.token))
            return false;
        if (sessionId == null) {
            if (other.sessionId != null)
                return false;
        }
        else if (!sessionId.equals(other.sessionId))
            return false;
        if (bin == null) {
            if (other.bin != null)
                return false;
        }
        else if (!bin.equals(other.bin))
            return false;
        if (paymentTool == null) {
            if (other.paymentTool != null)
                return false;
        }
        else if (!paymentTool.equals(other.paymentTool))
            return false;
        if (failureCode == null) {
            if (other.failureCode != null)
                return false;
        }
        else if (!failureCode.equals(other.failureCode))
            return false;
        if (failureDescription == null) {
            if (other.failureDescription != null)
                return false;
        }
        else if (!failureDescription.equals(other.failureDescription))
            return false;
        if (context == null) {
            if (other.context != null)
                return false;
        }
        else if (!Arrays.equals(context, other.context))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((paymentId == null) ? 0 : paymentId.hashCode());
        result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
        result = prime * result + ((invoiceId == null) ? 0 : invoiceId.hashCode());
        result = prime * result + ((merchantId == null) ? 0 : merchantId.hashCode());
        result = prime * result + ((shopId == null) ? 0 : shopId.hashCode());
        result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
        result = prime * result + ((maskedPan == null) ? 0 : maskedPan.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((amount == null) ? 0 : amount.hashCode());
        result = prime * result + ((fee == null) ? 0 : fee.hashCode());
        result = prime * result + ((currencyCode == null) ? 0 : currencyCode.hashCode());
        result = prime * result + ((paymentSystem == null) ? 0 : paymentSystem.hashCode());
        result = prime * result + ((countryId == null) ? 0 : countryId.hashCode());
        result = prime * result + ((cityId == null) ? 0 : cityId.hashCode());
        result = prime * result + ((ip == null) ? 0 : ip.hashCode());
        result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
        result = prime * result + ((changedAt == null) ? 0 : changedAt.hashCode());
        result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((token == null) ? 0 : token.hashCode());
        result = prime * result + ((sessionId == null) ? 0 : sessionId.hashCode());
        result = prime * result + ((bin == null) ? 0 : bin.hashCode());
        result = prime * result + ((paymentTool == null) ? 0 : paymentTool.hashCode());
        result = prime * result + ((failureCode == null) ? 0 : failureCode.hashCode());
        result = prime * result + ((failureDescription == null) ? 0 : failureDescription.hashCode());
        result = prime * result + ((context == null) ? 0 : Arrays.hashCode(context));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Payment (");

        sb.append(paymentId);
        sb.append(", ").append(eventId);
        sb.append(", ").append(invoiceId);
        sb.append(", ").append(merchantId);
        sb.append(", ").append(shopId);
        sb.append(", ").append(customerId);
        sb.append(", ").append(maskedPan);
        sb.append(", ").append(status);
        sb.append(", ").append(amount);
        sb.append(", ").append(fee);
        sb.append(", ").append(currencyCode);
        sb.append(", ").append(paymentSystem);
        sb.append(", ").append(countryId);
        sb.append(", ").append(cityId);
        sb.append(", ").append(ip);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(changedAt);
        sb.append(", ").append(phoneNumber);
        sb.append(", ").append(email);
        sb.append(", ").append(token);
        sb.append(", ").append(sessionId);
        sb.append(", ").append(bin);
        sb.append(", ").append(paymentTool);
        sb.append(", ").append(failureCode);
        sb.append(", ").append(failureDescription);
        sb.append(", ").append("[binary...]");

        sb.append(")");
        return sb.toString();
    }
}
