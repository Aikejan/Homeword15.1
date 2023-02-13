package person;

public class Driver extends Person {
    public Driver(String name, int age) {
        super(name,age);
    }



    @Override
    public void working() {
        System.out.println("Taxi");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
