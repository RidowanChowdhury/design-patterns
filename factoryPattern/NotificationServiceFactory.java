package factoryPattern;

public class NotificationServiceFactory {

    public NotificationService getNotificationService(String serviceType) {
        if ("EMAIL".equalsIgnoreCase(serviceType)) {
            return new EmailNotificationService();
        } else if ("SMS".equalsIgnoreCase(serviceType)) {
            return new SmsNotificationService();
        } else if ("PUSH".equalsIgnoreCase(serviceType)) {
            return new PushNotificationService();
        }
        throw new IllegalArgumentException("Unknown service type: " + serviceType);
    }
}