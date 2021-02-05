package Anya_programist.cods;

import java.util.ArrayList;
import java.util.List;

public class Code9 {
    public static List<String> number(List<String> lines) {
        List<String> lines2 = new ArrayList<>();
        for(int i = 0; i < lines.size(); i++){
            lines2.add(i++ + ": " + lines.get(i));

        }
        return lines2;
    }
}
