import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Маша", "Машина", 1);
        Person p2 = new Person("Пятя", "Петрооооооооооооооооооооооооооов", 10);
        Person p3 = new Person("Саша", "Васиииииииииииин", 7);
        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.sort(new Comparator(10));
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}
