package com.mataycode.notification;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Notification {

    @Id
    @SequenceGenerator(
            name = "notification_id_sequence",
            sequenceName = "notification_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "notification_id_sequence"
    )
    private Integer notificationId;
    private Integer toCustomerId;
    private String toCustomerEmail;
    private String sender;
    private String message;
    private LocalDateTime sentAt;

    public Notification(Integer notificationId, Integer toCustomerId, String toCustomerEmail, String sender, String message, LocalDateTime sentAt) {
        this.notificationId = notificationId;
        this.toCustomerId = toCustomerId;
        this.toCustomerEmail = toCustomerEmail;
        this.sender = sender;
        this.message = message;
        this.sentAt = sentAt;
    }

    public Notification() {
    }

    public static NotificationBuilder builder() {
        return new NotificationBuilder();
    }

    public Integer getNotificationId() {
        return this.notificationId;
    }

    public Integer getToCustomerId() {
        return this.toCustomerId;
    }

    public String getToCustomerEmail() {
        return this.toCustomerEmail;
    }

    public String getSender() {
        return this.sender;
    }

    public String getMessage() {
        return this.message;
    }

    public LocalDateTime getSentAt() {
        return this.sentAt;
    }

    public void setNotificationId(Integer notificationId) {
        this.notificationId = notificationId;
    }

    public void setToCustomerId(Integer toCustomerId) {
        this.toCustomerId = toCustomerId;
    }

    public void setToCustomerEmail(String toCustomerEmail) {
        this.toCustomerEmail = toCustomerEmail;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Notification)) return false;
        final Notification other = (Notification) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$notificationId = this.getNotificationId();
        final Object other$notificationId = other.getNotificationId();
        if (this$notificationId == null ? other$notificationId != null : !this$notificationId.equals(other$notificationId))
            return false;
        final Object this$toCustomerId = this.getToCustomerId();
        final Object other$toCustomerId = other.getToCustomerId();
        if (this$toCustomerId == null ? other$toCustomerId != null : !this$toCustomerId.equals(other$toCustomerId))
            return false;
        final Object this$toCustomerEmail = this.getToCustomerEmail();
        final Object other$toCustomerEmail = other.getToCustomerEmail();
        if (this$toCustomerEmail == null ? other$toCustomerEmail != null : !this$toCustomerEmail.equals(other$toCustomerEmail))
            return false;
        final Object this$sender = this.getSender();
        final Object other$sender = other.getSender();
        if (this$sender == null ? other$sender != null : !this$sender.equals(other$sender)) return false;
        final Object this$message = this.getMessage();
        final Object other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
        final Object this$sentAt = this.getSentAt();
        final Object other$sentAt = other.getSentAt();
        if (this$sentAt == null ? other$sentAt != null : !this$sentAt.equals(other$sentAt)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Notification;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $notificationId = this.getNotificationId();
        result = result * PRIME + ($notificationId == null ? 43 : $notificationId.hashCode());
        final Object $toCustomerId = this.getToCustomerId();
        result = result * PRIME + ($toCustomerId == null ? 43 : $toCustomerId.hashCode());
        final Object $toCustomerEmail = this.getToCustomerEmail();
        result = result * PRIME + ($toCustomerEmail == null ? 43 : $toCustomerEmail.hashCode());
        final Object $sender = this.getSender();
        result = result * PRIME + ($sender == null ? 43 : $sender.hashCode());
        final Object $message = this.getMessage();
        result = result * PRIME + ($message == null ? 43 : $message.hashCode());
        final Object $sentAt = this.getSentAt();
        result = result * PRIME + ($sentAt == null ? 43 : $sentAt.hashCode());
        return result;
    }

    public String toString() {
        return "Notification(notificationId=" + this.getNotificationId() + ", toCustomerId=" + this.getToCustomerId() + ", toCustomerEmail=" + this.getToCustomerEmail() + ", sender=" + this.getSender() + ", message=" + this.getMessage() + ", sentAt=" + this.getSentAt() + ")";
    }

    public static class NotificationBuilder {
        private Integer notificationId;
        private Integer toCustomerId;
        private String toCustomerEmail;
        private String sender;
        private String message;
        private LocalDateTime sentAt;

        NotificationBuilder() {
        }

        public NotificationBuilder notificationId(Integer notificationId) {
            this.notificationId = notificationId;
            return this;
        }

        public NotificationBuilder toCustomerId(Integer toCustomerId) {
            this.toCustomerId = toCustomerId;
            return this;
        }

        public NotificationBuilder toCustomerEmail(String toCustomerEmail) {
            this.toCustomerEmail = toCustomerEmail;
            return this;
        }

        public NotificationBuilder sender(String sender) {
            this.sender = sender;
            return this;
        }

        public NotificationBuilder message(String message) {
            this.message = message;
            return this;
        }

        public NotificationBuilder sentAt(LocalDateTime sentAt) {
            this.sentAt = sentAt;
            return this;
        }

        public Notification build() {
            return new Notification(this.notificationId, this.toCustomerId, this.toCustomerEmail, this.sender, this.message, this.sentAt);
        }

        public String toString() {
            return "Notification.NotificationBuilder(notificationId=" + this.notificationId + ", toCustomerId=" + this.toCustomerId + ", toCustomerEmail=" + this.toCustomerEmail + ", sender=" + this.sender + ", message=" + this.message + ", sentAt=" + this.sentAt + ")";
        }
    }
}