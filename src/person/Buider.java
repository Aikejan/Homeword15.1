package person;

public class Buider extends Person {
    public Buider(String name, int age) {
        super(name, age);
    }


    @Override
    public void working() {
        System.out.println("Build");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
