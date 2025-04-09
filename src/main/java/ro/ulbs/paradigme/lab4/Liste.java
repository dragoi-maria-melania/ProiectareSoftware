package ro.ulbs.paradigme.lab4;

import java.util.*;

public class Liste {
    public static void main(String[] args) {



        // Inițializăm listele goale
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> xPlusY = new ArrayList<>(); // a
        Set<Integer> zSet = new TreeSet<>(); // b - set ordonat, fără duplicate
        List<Integer> xMinusY = new ArrayList<>(); // c
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList<>(); // d

        // Generare numere aleatorii în intervalul [0..10]
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            x.add(rand.nextInt(11)); // 0..10
        }

        for (int i = 0; i < 7; i++) {
            y.add(rand.nextInt(11));
        }

        // Sortăm listele
        Collections.sort(x);
        Collections.sort(y);

        System.out.println("Lista x sortată: " + x);
        System.out.println("Lista y sortată: " + y);

        // a) xPlusY conține toate elementele din x și y
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);
        System.out.println("xPlusY (x + y): " + xPlusY);

        // b) zSet conține elemente comune din x și y (fără duplicate)
        for (Integer val : x) {
            if (y.contains(val)) {
                zSet.add(val);
            }
        }
        System.out.println("zSet (elemente comune): " + zSet);

        // c) xMinusY: elementele din x care nu sunt în y
        for (Integer val : x) {
            if (!y.contains(val)) {
                xMinusY.add(val);
            }
        }
        System.out.println("xMinusY (x - y): " + xMinusY);

        // d) xPlusYLimitedByP: elementele din x și y <= p
        for (Integer val : x) {
            if (val <= p) {
                xPlusYLimitedByP.add(val);
            }
        }
        for (Integer val : y) {
            if (val <= p) {
                xPlusYLimitedByP.add(val);
            }
        }
        Collections.sort(xPlusYLimitedByP);
        System.out.println("xPlusYLimitedByP (<= " + p + "): " + xPlusYLimitedByP);







    }




}
