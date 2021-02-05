package Anya_programist.generic;

class Automobile{}

public class HolderObject {
    private  Object a;
    public HolderObject(Object a){
        this.a = a;
    }
    public void setA(Object a){
        this.a = a;
    }
    public Object getA(){
        return a;
    }
    public static void main(String[] args){
        HolderObject ho = new HolderObject(new Automobile());
        Automobile a = (Automobile)ho.getA();
        ho.setA("Not an Automobile");
        String s =(String)ho.getA();
        ho.setA(1);
        Integer x = (Integer)ho.getA();
    }
}
