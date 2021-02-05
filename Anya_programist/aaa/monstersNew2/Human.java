package Anya_programist.aaa.monstersNew2;

public class Human extends Entity implements Fighter {
    public Human(String name) {
        super(name + " the Man");
    }

    @Override
    public void attack(Entity m){
        m.damage(1);
    }
}
