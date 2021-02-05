package Anya_programist.objectM;

import java.util.Objects;

public class EqualsM2 {
    int dnaCode;

    public boolean equals(EqualsM2 equalsM2) {
        return this.dnaCode ==  equalsM2.dnaCode;

    }


    @Override
    public int hashCode() {
        return Objects.hash(dnaCode);
    }

    public static void main(String[] args) {

        EqualsM2 man1 = new EqualsM2();
        man1.dnaCode = 1111222233;

        EqualsM2 man2 = new EqualsM2();
        man2.dnaCode = 1111222233;

        System.out.println(man1.equals(man2));
        //System.out.println(man1.hashCode(man2));


    }
}

