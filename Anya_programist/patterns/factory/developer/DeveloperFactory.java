package Anya_programist.patterns.factory.developer;

import Anya_programist.patterns.factory.developer.Developer;

public class DeveloperFactory {
    public static Developer createJavaDeveloper(){
        return new JavaDeveloper();
    }

    public static Developer createCppDeveloper(){
        return new CppDeveloper();
    }
}
