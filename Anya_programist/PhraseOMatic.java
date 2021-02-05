package Anya_programist;

class LoopUti {

    private int width;
    //private int height;

//    public int getHeight() {
//        return height;
//    }

    public int getWidth() {
        return width;
    }

//    public void setHeight(int x) {
//        height = x;
//    }

    public void setWidth(int y) {
        width = y;
    }

    void loop(String vallue) {
        for (int i = 0; i <width ; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(vallue);
            }
            System.out.println();

        }

    }

}
