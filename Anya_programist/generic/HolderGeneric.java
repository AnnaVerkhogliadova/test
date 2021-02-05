package Anya_programist.generic;

public class HolderGeneric<T> {
    private T a;
    public HolderGeneric(T a){
        this.a = a;
    }
    public void setA(T a){
        this.a = a;
    }
    public T getA(){
        return a;
    }
    public static void main(String[] args){
        HolderGeneric<Automobile> hg = new HolderGeneric<>(new Automobile());
        Automobile a = hg.getA();
    }
}
