package Anya_programist;


import java.util.Arrays;
import java.util.List;

final class MutableClass {
    final String name;
    final String address;
    final int age;

    MutableClass(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void action() {
        List<MutableClass> mutableList = Arrays.asList(new MutableClass("san", "UK", 21),
                new MutableClass("peter", "US", 34));
        MutableClass mutableClass = new MutableClass("Anna", "SPB", 20);
        mutableList.add(mutableClass);
    }
}

