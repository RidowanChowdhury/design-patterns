### Explanation

Interface Definition: NotificationService is an interface with a method sendNotification.

Concrete Implementations: We have three classes: EmailNotificationService, SmsNotificationService, and PushNotificationService. Each implements the NotificationService interface.

Factory Class: NotificationServiceFactory contains a method getNotificationService that returns an appropriate service instance based on the input string serviceType. If the input string is unrecognized, it throws an IllegalArgumentException.

Test in Main Method: FactoryPatternDemo contains the main method where we instantiate the NotificationServiceFactory and use it to create different types of notification services. It demonstrates how to use the factory to get instances of the notification services and call their sendNotification method.

### Notes
* Factory pattern is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. 
* Factory pattern enables loose coupling between the creator and the concrete products. 
* Factory pattern enables introduce changes into the program without breaking existing client code. 
* Factory pattern can be quite handy for creating objects where the exact type of the object may not be known until runtime. 
* Use the Factory pattern when you don’t know beforehand the exact types and dependencies of the objects your code should work with. 
* Use the Factory pattern when you want to provide users of your library or framework with a way to extend its internal components.
