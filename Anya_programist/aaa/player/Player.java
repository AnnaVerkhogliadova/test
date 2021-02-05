package Anya_programist.aaa.player;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Player extends Human {
    public Player(String name) {
        super(name);
    }

    Backpack backpack = new Backpack();

    void take(String thing) {
        for (int i = 0; i < backpack.things.length; i++) {
            if (backpack.things[i] == null) {
                backpack.things[i] = thing;
                break;
            }
        }
    }

    class Backpack {
        String[] things = new String[100];

        @Override
        public String toString() {
            String result = " in the backpack";

            StringBuilder sb = new StringBuilder();
            if (things[0] == null) {
                return "the backpack is empty";
            } else {
                for (int i = 0; i < things.length; i++) {
                    if (things[i] != null) {
                        if (i > 0) {
                            sb.append(",");
                        }

                        sb.append(things[i]);
                    }
                }
                return sb.toString() + result;
            }
        }
    }
}


