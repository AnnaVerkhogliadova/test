package Anya_programist.yandex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alevina {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        process();
    }

    private static void process() {
        Input input = input();

        List<List<Interval>> array = new ArrayList<>();
        for (int i = 0; i < input.getN(); i++) {
            List<Interval> tempArr = new ArrayList<>();
            Interval interval = input.getA()[i];
            tempArr.add(interval);
            for (int j = i + 1; j < input.getN(); j++) {
                if (tempArr.get(tempArr.size() - 1).getB() >= input.getA()[j].getA()) {
                    continue;
                } else {
                    tempArr.add(input.getA()[j]);
                }
                for (int k = j + 1; k < input.getN(); k++) {
                    if (tempArr.get(tempArr.size() - 1).getB() >= input.getA()[k].getA()) {
                        continue;
                    } else {
                        tempArr.add(input.getA()[k]);
                    }
                }
            }
            array.add(tempArr);
        }
        List<Interval> maxInterval = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (List<Interval> in : array) {
            int sum = 0;
            for (Interval i : in) {
                sum += i.getB() - i.getA() + 1;
            }
            if (sum > max) {
                maxInterval = in;
                max = sum;
            }
        }
        output(max, maxInterval.stream().mapToInt(Interval::getIndex).toArray());
    }

    private static Input input() {
        int n = Integer.parseInt(SCANNER.nextLine());
        Interval[] a = new Interval[n];
        int i = 0;
        while (SCANNER.hasNextLine()) {

            String[] s = SCANNER.nextLine().split(" ");
            if (s[0].isEmpty()) {
                break;
            }
            a[i] = new Interval(Integer.parseInt(s[0]),
                    Integer.parseInt(s[1]) + Integer.parseInt(s[0]) - 1,
                    i);
            i++;
        }
        return new Input(n, a);
    }

    private static void output(int maxX, int[] order) {
        System.out.println(maxX);
        String[] orderS = new String[order.length];
        for (int i = 0; i < order.length; i++) {
            orderS[i] = "" + order[i];
        }
        System.out.println(String.join(" ", orderS));
    }

    private static class Input {
        private final int n;
        private final Interval[] a;

        public Input(int n, Interval[] a) {
            this.n = n;
            this.a = a;
        }

        public int getN() {
            return n;
        }

        public Interval[] getA() {
            return a;
        }
    }

    public static class Interval {
        private final int a;
        private final int b;
        private final int index;

        public Interval(int a, int b, int index) {
            this.a = a;
            this.b = b;
            this.index = index;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public int getIndex() {
            return index;
        }
    }
}
