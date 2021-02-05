package Anya_programist.aaa.player;

public class Main {
    public static void main(String[] args) {
/*

Extend Human class by Player class with inner Backpack

*/
        Player player = new Player("Tourist");
        Player.Backpack pb = player.backpack;
        System.out.println(pb);
        player.take("rope");
        System.out.println(pb);
        player.take("bottle");
        player.take("flower");
        System.out.println(pb);

/*

The code above has to output

the backpack is empty
rope in the backpack
rope,bottle,flower in the backpack

*/
    }
}
