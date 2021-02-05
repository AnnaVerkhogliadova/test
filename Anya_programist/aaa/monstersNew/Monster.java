package Anya_programist.aaa.monstersNew;

public abstract class Monster {
    private String name;
    private int force;
    private int hp = 15;
    private boolean destroyed = false;

    public Monster(String name, int force) {
        this.name = name;
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }

    protected int getForce() {
        return force;
    }

    public boolean isDestroyed() {
        return destroyed;

    }

    protected boolean damage(int dhp) {
        hp -= dhp;
        if (hp <= 0) {
            return destroyed = true;
        } else {
            return destroyed;
        }
    }

    public abstract void attack(Monster monster);
}
