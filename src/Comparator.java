public class Comparator implements java.util.Comparator<Person> {
    private int maxAmountOfWords;

    public Comparator(int maxAmountOfWords) {
        this.maxAmountOfWords = maxAmountOfWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (getAmountOfWordsOfSurname(o1.getSurname()) == getAmountOfWordsOfSurname(o2.getSurname()))  {
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
    }

    private int getAmountOfWordsOfSurname(String surname) {
        return surname.split("-").length;
    }

    private int getAmountOfLettersOfSurname(String surname) {
        return surname.split("").length;
    }
}
