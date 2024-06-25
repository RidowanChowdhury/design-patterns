package factoryPattern;

public class PushNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Push Notification: " + message);
    }
}
