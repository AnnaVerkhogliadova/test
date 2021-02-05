package Anya_programist.aaa.monstersNew2;


public class GiantSnake extends Monster implements Fighter {
    public static String scream = "Ssssss";

    public GiantSnake(String name) {
        super(name + " the GiantSnake", 5);
    }


    public void growl(){
        System.out.println(scream);
    }

    @Override
    public void attack(Entity m){
        growl();
    }
}
