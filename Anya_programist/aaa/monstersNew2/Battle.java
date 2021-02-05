package Anya_programist.aaa.monstersNew2;

import java.util.Random;

public class Battle {
    final static private int MAX = 5;

    private Entity[] entities;
    private int n = 0;

    Battle(){
        entities = new Entity[MAX];
    }

    public void add(Entity entity){
        if (n < MAX) {
            entities[n++] = entity;
        }
        else{
            System.out.println("No more members!");
        }
    }

    public void run(){
        Random random = new Random();
        int destroyed = 0;
        while (destroyed != n - 1){
            Entity fighter = entities[random.nextInt(n)];
            Entity victim = entities[random.nextInt(n)];
            //find non destroyed Fighter and his victim
            while (fighter == null || victim == null || !(fighter instanceof Fighter) || fighter == victim){
                victim = entities[random.nextInt(n)];
                fighter = entities[random.nextInt(n)];
            }
            ((Fighter)fighter).attack(victim);
            if (victim.isDestroyed()){
                victim = null;
                destroyed++;
            }
        }

        System.out.println("The Great Battle is finished");

    }

    public void start(){
        run();
    }
}
