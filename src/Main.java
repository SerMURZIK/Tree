import java.util.ArrayList;
import java.util.List;

public class Main {
    private static int maxAmountOfWords;

    public static void main(String[] args) {
        Person p1 = new Person("Маша", "Машина-Кузнецова", 15);
        Person p2 = new Person("Пятя", "Петров-Перемычкин", 10);
        Person p3 = new Person("Саша", "Васин", 7);
        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.sort((Person o1, Person o2) -> {
            if (getAmountOfWordsOfSurname(o1.getSurname()) == getAmountOfWordsOfSurname(o2.getSurname())) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }

            if (getAmountOfWordsOfSurname(o1.getSurname()) != getAmountOfWordsOfSurname(o2.getSurname())) {
                return Integer.compare(getAmountOfWordsOfSurname(o1.getSurname()), getAmountOfWordsOfSurname(o2.getSurname()));
            }

            if (getAmountOfLettersOfSurname(o1.getSurname()) >= maxAmountOfWords && getAmountOfLettersOfSurname(o2.getSurname()) >= maxAmountOfWords) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else {
                if (o1.getSurname().compareTo(o2.getSurname()) != 0) {
                    return o1.getSurname().compareTo(o2.getSurname());
                } else {
                    return Integer.compare(o1.getAge(), o2.getAge());
                }
            }
        });

        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }

    private static int getAmountOfWordsOfSurname(String surname) {
        return surname.split("(?U)\\W").length;
    }

    private static int getAmountOfLettersOfSurname(String surname) {
        return surname.split("").length;
    }
}
