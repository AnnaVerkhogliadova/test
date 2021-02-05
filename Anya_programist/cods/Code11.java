package Anya_programist.cods;

public class Code11 {
    static int stray(int[] numbers) {
        int x = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (x != numbers[i]){
                if (i == 1 && numbers[i] == numbers[i+1]){
                    return x;
                } else {
                    return numbers[i];
                }
            }
        }
        return x;
    }
}
