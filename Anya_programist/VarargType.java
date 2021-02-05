package Anya_programist;

public class VarargType {
    static void f(Character... args) {
        System.out.println(args.getClass());
        System.out.println("Длинна " + args.length);
    }
    static void g (int... args){
        System.out.println(args.getClass());
        System.out.println("Длинна " + args.length);
    }
    public static void main(String[] args) {
        f('a');
        f();
        g(2);
        g();
        System.out.println("int[]: " + new int[0].getClass());
    }
}
