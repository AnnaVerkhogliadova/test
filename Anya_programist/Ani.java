package Anya_programist;

public class Ani {
    int id = 2;
    public void sleep() {}
    public void eat(){}

    static void ana(){}
    private void non() {}
    Ani(int id) { this.id = id; }
}

class Dogg extends Ani {
    public void eat() {}
    public void sleep() {}


    public Dogg(int id) {
        super(id);
    }
}
