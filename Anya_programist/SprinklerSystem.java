package Anya_programist;

class WaterSource {
    private String s;
    WaterSource() {
        System.out.println("WaterSource()");
        s = "скорструирован";
    }

    @Override
    public String toString() {
        return s;
    }
}
public class SprinklerSystem {
    private String valvel, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString(){
        return
        "valval = " + valvel + " " +
        "valve2 = " + valve2 + " " +
        "valve3 = " + valve3 + " " +
        "valve4 = " + valve4 + "\n" +
        "i = " + i + " " + "f = " + f + " " +
        "source = " + source;
    }
    void mehood(){
        System.out.println("вызов метода");
    }
    public static void main (String[] args) {
        SprinklerSystem sprinkler = new SprinklerSystem();
        System.out.println(sprinkler);
//        sprinkler.mehood();
    }
}