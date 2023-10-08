import Observer.HealthObserver;
import Observer.Person;

public class main {
    public static void main(String[] args) {
        HealthObserver healthObserver = new HealthObserver();

        Person John = new Person("John",1, healthObserver);
        Person Jimmy = new Person("Jimmy", 2, healthObserver);

        healthObserver.updateHealthState(1, "Your health got worse");
    }
}
