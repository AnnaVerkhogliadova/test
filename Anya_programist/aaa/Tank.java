package Anya_programist.aaa;

public class Tank {
    int x;
    int y;
    int z;
    boolean f = true, b, l, r;

    int fuel;

    public Tank() {
        this(0, 0, 0);
    }

    public Tank(int x, int y, int z) {
        this(x, y, z, 100);
    }

    public Tank(int x, int y, int z, int fuel) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.fuel = fuel;
    }

    void goForward(int i) {
        boolean positiveDirection = i > 0;
        int distance = i;
        if (!positiveDirection) {
            distance = -distance;
        }
        if (distance > fuel) {
            distance = fuel;
        }
        fuel -= distance;
        if (!positiveDirection) {
            distance = -distance;
        }
        if (f) {
            x += distance;
        } else if (b) {
            x -= distance;
        } else if (l) {
            y -= distance;
        } else if (r) {
            y += distance;
        }
    }

    void turnRight() {
        if (f) {
            r = true;
            f = false;
        } else if (b) {
            l = true;
            b = false;
        } else if (l) {
            f = true;
            l = false;
        } else if (r) {
            b = true;
            r = false;
        }
    }

    void turnLeft() {
        if (f) {
            l = true;
            f = false;
        } else if (b) {
            r = true;
            b = false;
        } else if (l) {
            b = true;
            l = false;
        } else if (r) {
            f = true;
            r = false;
        }
    }

    void printPosition() {
        System.out.println("The Tank is at " + x + ", " + y + ", " + z + " now.");
    }

    void goBackward(int i) {
        goForward(-i);
    }

    void goUp(int i) {
        boolean positiveDirection2 = i > 0;
        int distance2 = i;
        if (!positiveDirection2) {
            distance2 = -distance2;
        }
        if (distance2 > fuel) {
            distance2 = fuel;
        }
        fuel -= distance2;
        z += distance2;
    }

    void go(int i) {
        goUp(-i);
    }
}

/*The Tank is at 10, 0 now.
The Tank is at 10, 50 now.
The Tank is at -90, 50 now.*/

    class Main {
        public static void main(String[] args) {
            Tank customTank = new Tank(0, 0, 0, 200);
            customTank.goForward(10);
            customTank.goUp(20);
            customTank.turnRight();
            customTank.goBackward(50);
            customTank.printPosition();
        }
    }