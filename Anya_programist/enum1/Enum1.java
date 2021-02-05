package Anya_programist.enum1;

public enum Enum1 {
    NOT(2), MILD(3), MEDIUM(4), HOT(5), FLAMING(6);
    private final int i;
    Enum1(int i) {
        this.i = i;
    }
    public int getI(){
        return i;
    }
}
class EnumTest{
    public static void main(String[] args){
        for( Enum1 s: Enum1.values()) {
            System.out.println(s.name() + " " + s.getI() );

        }
    }

}
