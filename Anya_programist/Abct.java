package Anya_programist;

@FunctionalInterface
interface Abct  {
    public abstract void rt(String s);
}

class AbctTest {
    Abct abct = System.out::println;
}
