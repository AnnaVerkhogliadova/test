package Anya_programist.interfece;

public interface IPrint {
    void print();
}

interface P{
    void printImpl2();
}

class PrintImpl implements IPrint, P{
   public void print(){
       System.out.println(" В классе PrintImpl");
   }
   public void printImpl2() {

   }
}

class Main{
   private final IPrint iPrint;
   private final P p;
    Main(IPrint iPrint, P p){
        this.iPrint = iPrint;
        this.p = p;
    }
    public IPrint getPrint(){
        return iPrint;
    }

    public P getP(){
        return p;
    }


    public static void main(String[] args){
        IPrint iPrint1 = () -> System.out.println("govnyashka");
        iPrint1.print();
        PrintImpl printImpl = new PrintImpl();
        Main main = new Main(printImpl, printImpl);
        main.getP().printImpl2();
        IPrint iPrint = main.getPrint();
        iPrint.print();

    }

}
