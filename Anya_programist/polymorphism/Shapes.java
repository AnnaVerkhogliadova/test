package Anya_programist.polymorphism;

public class Shapes {
    private static RandomShapeGeneration gen = new RandomShapeGeneration();

    public static void main(String[] args) {
        Shape[] s = new Shape[9]; //заполняем массив фигурами
        for (int i = 0; i < s.length; i++)
            s[i] = gen.next();
        for (Shape shp : s)
            shp.draw();
    }

}
