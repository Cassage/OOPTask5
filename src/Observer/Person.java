package Observer;

public class Person {
    String name;
    int id;

    public Person(String name, int id, HealthObserver observer) {
        this.name = name;
        this.id = id;
        observer.register(this);
    }

    void getNotification(String notification){
        System.out.println(notification);
    }


}
