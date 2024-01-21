import models.Employee;
import models.Person;
import models.Student;

public class Main {
    public static void main(String[] args) {
        Person s1 = new Student("Jax", "Jax", 4d);
        Person s2 = new Student("Beka", "Bekov", 1.27);
        Person e1 = new Employee("Dima", "Dimos", "Worker", 100000d);
        Person e2 = new Employee("Aman", "Zhanat", "Head office", 10000000d);
        printData(s1, s2, e1, e2);
    }

    public static void printData(Person... persons) {
        for(Person person : persons) {
            String data = person.toString() + " earns " + person.getPaymentAmount() + " tenge.";
            System.out.println(data);
        }
    }
}
