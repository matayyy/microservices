package com.mataycode.fraud;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class FraudCheckHistory {

    @Id
    @SequenceGenerator(
            name = "fraud_id_sequence",
            sequenceName = "fraud_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "fraud_id_sequence"
    )
    private Integer id;
    private Integer customerId;
    private Boolean isFraudster;
    private LocalDateTime createdAt;

    public FraudCheckHistory(Integer id, Integer customerId, Boolean isFraudster, LocalDateTime createdAt) {
        this.id = id;
        this.customerId = customerId;
        this.isFraudster = isFraudster;
        this.createdAt = createdAt;
    }

    public FraudCheckHistory() {
    }

    public static FraudCheckHistoryBuilder builder() {
        return new FraudCheckHistoryBuilder();
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getCustomerId() {
        return this.customerId;
    }

    public Boolean getIsFraudster() {
        return this.isFraudster;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setIsFraudster(Boolean isFraudster) {
        this.isFraudster = isFraudster;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof FraudCheckHistory)) return false;
        final FraudCheckHistory other = (FraudCheckHistory) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$customerId = this.getCustomerId();
        final Object other$customerId = other.getCustomerId();
        if (this$customerId == null ? other$customerId != null : !this$customerId.equals(other$customerId))
            return false;
        final Object this$isFraudster = this.getIsFraudster();
        final Object other$isFraudster = other.getIsFraudster();
        if (this$isFraudster == null ? other$isFraudster != null : !this$isFraudster.equals(other$isFraudster))
            return false;
        final Object this$createdAt = this.getCreatedAt();
        final Object other$createdAt = other.getCreatedAt();
        if (this$createdAt == null ? other$createdAt != null : !this$createdAt.equals(other$createdAt)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof FraudCheckHistory;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $customerId = this.getCustomerId();
        result = result * PRIME + ($customerId == null ? 43 : $customerId.hashCode());
        final Object $isFraudster = this.getIsFraudster();
        result = result * PRIME + ($isFraudster == null ? 43 : $isFraudster.hashCode());
        final Object $createdAt = this.getCreatedAt();
        result = result * PRIME + ($createdAt == null ? 43 : $createdAt.hashCode());
        return result;
    }

    public String toString() {
        return "FraudCheckHistory(id=" + this.getId() + ", customerId=" + this.getCustomerId() + ", isFraudster=" + this.getIsFraudster() + ", createdAt=" + this.getCreatedAt() + ")";
    }

    public static class FraudCheckHistoryBuilder {
        private Integer id;
        private Integer customerId;
        private Boolean isFraudster;
        private LocalDateTime createdAt;

        FraudCheckHistoryBuilder() {
        }

        public FraudCheckHistoryBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public FraudCheckHistoryBuilder customerId(Integer customerId) {
            this.customerId = customerId;
            return this;
        }

        public FraudCheckHistoryBuilder isFraudster(Boolean isFraudster) {
            this.isFraudster = isFraudster;
            return this;
        }

        public FraudCheckHistoryBuilder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public FraudCheckHistory build() {
            return new FraudCheckHistory(this.id, this.customerId, this.isFraudster, this.createdAt);
        }

        public String toString() {
            return "FraudCheckHistory.FraudCheckHistoryBuilder(id=" + this.id + ", customerId=" + this.customerId + ", isFraudster=" + this.isFraudster + ", createdAt=" + this.createdAt + ")";
        }
    }
}
