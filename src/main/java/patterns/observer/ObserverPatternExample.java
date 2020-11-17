package patterns.observer;

// Error handlers for different exception types?
//   - Has an error occurred, should I do anything?
//   - If not, ignore
//   - Else handle
// Message handlers for different message types?
public class ObserverPatternExample {
    public static void main(String[] args) {
        SubjectA subjectA = new SubjectA();
        ObserverA observerA = new ObserverA(subjectA);
        ObserverB observerB = new ObserverB(subjectA);

        System.out.println("Before: " + observerA.toString());
        System.out.println("Before: " + observerB.toString());

        // When the subject has a new event - in this case an updated value
        // it will notfiy all of the observers registered to the subject
        subjectA.newValue("Hello");

        // Each observer has it's own update method implementation and handles them differently
        // in this case we are just appending extra text to the update for each observer
        System.out.println("After 1: " + observerA.toString());
        System.out.println("After 1: " + observerB.toString());

        subjectA.newValue("World");

        // It can be called many times without consequence, although it is not threadsafe
        System.out.println("After 2: " + observerA.toString());
        System.out.println("After 2: " + observerB.toString());
    }
}
