package Anya_programist;

class Soap {
    private String s;

    Soap() {
        System.out.println("Soup()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}

public class Bath {
    private String
            s1 = "Счастливый",
            s2 = "Счастливый",
            s3, s4;
    private Soap castille;
    private int i;
    private float toy;

    public Bath() {
        System.out.println("Bath()");
        s3 = "Радостный";
        toy = 3.14f;
        castille = new Soap();
    }

    {
        i = 47;
    }

    public String toString() {
        if (s4 == null)
            s4 = "Радостный";
        return
                "s1 = " + s1 + "\n" +
                        "s2" + s2 + "\n" +
                        "s3" + s3 + "\n" +
                        "s4" + s4 + "\n" +
                        "i = " + i + "\n" +
                        "toy = " + toy + "\n" +
                        "castille = " + castille;
    }
    public static void main(String[] args){
        Bath b = new Bath();
        System.out.println(b);
    }

}
