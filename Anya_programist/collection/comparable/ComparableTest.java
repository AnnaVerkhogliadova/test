package Anya_programist.collection.comparable;

import java.util.*;

public class ComparableTest {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Set<Person> personSet = new TreeSet<>();
        List<Person> personList1 = new ArrayList<>();

        addElements(personList);
        addElements(personSet);
        addElements(personList1);

        Collections.sort(personList);
        Collections.reverse(personList1);

        System.out.println(personList);
        System.out.println(personSet);
        System.out.println(personList1);
        System.out.println( );

    }

    private static void addElements(Collection collection) {
        collection.add(new Person(3, "Анна"));
        collection.add(new Person(12, "Борис"));
        collection.add(new Person(2, "Вера"));
        collection.add(new Person(1, "Григорий"));
        collection.add(new Person(6, "Дарья"));
    }
}

class Person implements Comparable<Person> {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Person o) {
        if (this.name.length() > o.getName().length()) {
            return 1;
        } else if (this.name.length() < o.getName().length()) {
            return -1;
        } else {
            return 0;
        }
    }
}
