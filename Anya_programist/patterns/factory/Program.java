//package Anya_programist.patterns.factory;
//
//import Anya_programist.patterns.factory.developer.Developer;
//import Anya_programist.patterns.factory.developer.DeveloperFactory;
//
//public class Program {
//    public static void main(String[] args) {
//        DeveloperFactory developerFactory = CreateDeveloperBySpecialty("java");
//        Developer developer = developerFactory.createDeveloper();
//
//        developer.writeCode();
//    }
//
//    static DeveloperFactory CreateDeveloperBySpecialty(String special) {
//        if (special.equalsIgnoreCase("Java")) {
//            return new JavaDeveloperFactory();
//        } else if (special.equalsIgnoreCase("c++")) {
//            return new CppDeveloperFactory();
//        } else {
//            throw new RuntimeException(special + "is unknown special");
//
//        }
//    }
//}
