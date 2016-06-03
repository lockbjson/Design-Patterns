package observer1;
public class Customer implements Observer {    
    private String name;
    private int age;
 
 
    public Customer(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
 
 
    @Override
    public void update(String message) {
        System.out.println(name + " " + message);
    }
}