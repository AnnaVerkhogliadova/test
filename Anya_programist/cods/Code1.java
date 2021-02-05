package Anya_programist.cods;

import java.math.BigDecimal;
import java.math.MathContext;

public class Code1 {
    public static String seriesSum(int n) {
        if(n == 0){
            return "0.00";
        }
        double sum = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / b;
            b += 3;
        }
        return new BigDecimal(sum).round(new MathContext(3)).toString();
//        return String.valueOf(sum).substring(0, 4);
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(5));

    }
}

