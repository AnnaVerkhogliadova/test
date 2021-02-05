package Anya_programist.patterns.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        Singleton f = Singleton.getInstance();
        Singleton s = Singleton.getInstance();
        System.out.println(f == s);
    }
}
