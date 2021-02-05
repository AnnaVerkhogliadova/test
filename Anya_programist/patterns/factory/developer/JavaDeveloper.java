package Anya_programist.patterns.factory.developer;

import Anya_programist.patterns.factory.developer.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("write Java code...");
    }
}
