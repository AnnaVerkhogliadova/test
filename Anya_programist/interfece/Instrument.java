package Anya_programist.interfece;

abstract class Instrument {
    private int i;
    public abstract void play(Note n);
    public String what() { return "Instrument";}
    public abstract void adjust();
}
class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("Wind.play()" + n);
    }
    public String what() {return "Wind";}
    public void adjust() {
    }
}
class Percussion extends Instrument{
    public void play (Note n) {
        System.out.println("Percussion.play()" + n);
    }
    public String what() {return "Percussion";}
    public void adjust(){}
}
class Stringed extends Instrument{
    public void play(Note n) {
        System.out.println("Stringed.play()" + n);
    }
    public String what() {return "Stringed";}
    public void adjust() {}
}
class Brass extends Instrument {
    public void play(Note n) {
        System.out.println("Brass.play" + n);
    }
    public void adjust() {
        System.out.println("Brass.adjust()");
    }
}
class Woodwind extends Instrument{
    public void play(Note n){
        System.out.println("Woodwind.play" + n);
    }
    public String what() {return "woodwind";}
    public void adjust() {}
}
class Music4 {
    static void ture(Instrument i) {
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll (Instrument[] e) {
        for(Instrument i:e){
            ture(i);
        }
    }
    public static void main (String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
    }
}