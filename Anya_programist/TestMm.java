package Anya_programist;

public class TestMm {
    public static void main(String[] args) {
        Integer a[] = {1,2,3,4,5};
        Integer b[] = {5,6,7,8,9};

        for (int i = 0; i < a.length; i++){
            for(int s = 0; i < b.length; s++){
                if (a[i] == b[s]){
                    System.out.println(a[i] == b[s]);
                }
            }
        }
    }
}
