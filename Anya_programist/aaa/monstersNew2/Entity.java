package Anya_programist.aaa.monstersNew2;

public abstract class Entity {
    private String name;
    private int hp = 15;
    private boolean destroyed = false;

    public Entity(String name) {
        this.name = name;
    }

    protected boolean damage(int dhp){
        hp -= dhp;
        if (hp < 0){
            destroyed = true;
            System.out.println("Monster " + name + " was destroyed");
            return true;
        }
        return false;
    }

    public boolean isDestroyed(){
        return destroyed;
    }
}
