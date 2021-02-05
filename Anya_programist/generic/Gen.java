package Anya_programist.generic;

public class Gen<T> {
    T ob;

    Gen(T o) {
        this.ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Тип T: " + ob.getClass().getName());
    }
}

