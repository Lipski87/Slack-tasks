package pl.maciek.zadania_rekrutacyjne;

import java.lang.Math;
import java.util.Arrays;

public class MaskaBitowa {

    public static void main(String[] args) {
        double[] array = {7.727920455};

        System.out.println(maskaBitowa(array));

        int numb = 106;

        System.out.println(Arrays.toString(element(numb)));
    }

    public static double maskaBitowa(double[] id) {

        int number = 0;

        for (int i = 0; i < id.length; i++) {
            number += Math.pow(2,(id[i] - 1));
        }
        return number;
    }

    public static double[] element (double a) {
        double x = (Math.log10(a)/Math.log10(2))+1;
        double[] tab = {x};
        return tab;
    }

}
