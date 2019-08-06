package greetings;

/**
 * Greeting object.
 * 
 * A greeting that optionally includes the name of the one to be greeted.
 */
public class Greeting {

    private final String greeting;

    /**
     * Constructor.
     * 
     * Constructs the greeting. Greetings can be Hello, Hello <firstName>, Hello
     * <firstName> <lastName>, but never Hello <lastName>
     * 
     * @param firstName the first name used in the greeting
     * @param lastName  the last name used in the greeting
     */
    public Greeting(String firstName, String lastName) {
        if (firstName == null || firstName.isEmpty()) {
            this.greeting = "Hello!";
        } else if (lastName == null || lastName.isEmpty()) {
            this.greeting = String.format("Hello, %s!", firstName);
        } else {
            this.greeting = String.format("Hello, %s %s!", firstName, lastName);
        }
    }

    /**
     * @return the greeting
     */
    public String getGreeting() {
        return greeting;
    }
}
