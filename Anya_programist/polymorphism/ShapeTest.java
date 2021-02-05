package Anya_programist.polymorphism;

public class ShapeTest {
   public void test(Shape... shapes) {
        for (Shape shape:shapes) {
            shape.draw();
        }
    }
    public static void main(String[] args) {
        ShapeTest shape = new ShapeTest();
        Circle cir = new Circle();
        Triangle tra = new Triangle();
        Square square = new Square();
        shape.test(cir, tra, square);
    }
}

