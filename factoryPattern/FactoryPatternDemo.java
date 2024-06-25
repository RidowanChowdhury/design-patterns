package factoryPattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        NotificationServiceFactory factory = new NotificationServiceFactory();

        NotificationService emailService = factory.getNotificationService("EMAIL");
        emailService.sendNotification("Welcome to email notifications!");

        NotificationService smsService = factory.getNotificationService("SMS");
        smsService.sendNotification("Welcome to sms notifications!");

        NotificationService pushService = factory.getNotificationService("PUSH");
        pushService.sendNotification("Welcome to push notifications!");
    }
}