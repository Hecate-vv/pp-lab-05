import company.implementations.EmailMessenger;
import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.utils.MathUtils;
public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        final int b = 10;
        try {
            people[0] = new Person("Natasza Bark", 30);
            people[1] = new Person("Filip Goodman", 23);
            people[2] = new Person("Lila Lilliana", 63);
            people[3] = new Person("Michał Bułka", 20);
            people[4] = new Person("Michael Jackdottir", 54);
        }
        catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
        EmailMessenger emailMessenger = new EmailMessenger();
        for (Person person : people) {
            if (person != null) {
                int value = MathUtils.add(person.getAge(), b);
                emailMessenger.sendMessage("Bonjour " + person.getName() + ", your age is: " + value);
            }
        }
    }
}