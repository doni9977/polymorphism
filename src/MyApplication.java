import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Employee("doni", "Alves", "Manager", 27045.78));
        people.add(new Employee("Maks", "Harrison", "Developer", 50000.00));

        people.add(new Student("Daniel", "Starr", 2.5));
        people.add(new Student("Xabib", "Nurmagamedov", 3.8));

        Collections.sort(people);

        printData(people);
    }

    public static void printData(ArrayList<Person> payables) {
        for (Payable payable : payables) {
            System.out.println(payable.toString() + " earns " + String.format("%.2f", payable.getPaymentAmount()) + " tenge");
        }
    }
}
