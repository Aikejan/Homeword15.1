package person;

public class Programmer extends Person {
    public Programmer(String name,int age) {
        super(name,age);

    }

    @Override
    public void working() {
        System.out.println("Write cod");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
