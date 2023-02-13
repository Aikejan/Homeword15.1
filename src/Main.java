import person.Buider;
import person.Driver;
import person.Person;
import person.Programmer;

public class Main {
    public static void main(String[] args) {
    Programmer programmer= new Programmer("Anna",15);
    System.out.println(programmer);
    programmer.working();

    Driver driver = new Driver("Samat",42);
    System.out.println(driver);
        driver.working();

    Buider buider = new Buider("Ernazar", 40);
    System.out.println(buider);
        buider.working();



    }
}