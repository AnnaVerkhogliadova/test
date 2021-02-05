package Anya_programist.cods;

import java.util.List;

public class Code4 {
    public static boolean isSmileFace(String face) {
        char[] a = face.toCharArray();
        int size = a.length;
        if(size == 3){
            if (a[0] == ':' || a[0] == ';') {
                if (a[1] == '-' || a[1] == '~') {
                    return a[2] == ')' || a[2] == 'D';
                }
            }
        }
        if (size == 2){
            if (a[0] == ':' || a[0] == ';') {
                return a[1] == ')' || a[1] == 'D';
            }
        }
        return false;
    }

    public static int countSmileys(List<String> arr) {
        int count = 0;
        for(String face : arr){
            if (isSmileFace(face)){
                count++;
            }
        }

        return count;
    }
}
