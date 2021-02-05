package Anya_programist.serealize;

import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private String name;
    private transient char a;

    Person(int id, String name, char a) {
        this.id = id;
        this.name = name;
        this.a = a;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getA() {
        return a;
    }

    @Override
    public String toString() {
        return id + ") " + name + " '" + a + "'";
    }
}
