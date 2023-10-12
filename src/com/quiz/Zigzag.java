package com.quiz;

import java.util.Arrays;

public class Zigzag {
    public static void main(String[] args) {
        int a[] = {5, 4, 3, 2, 1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int i = 0;
        int j = a.length - 1;
        int k = 0;
        int b[] = new int[a.length];
        while (i != j && k < a.length - 1) {
            b[k] = a[i];
            b[k + 1] = a[j];
            k = k + 2;
            i++;
            j--;


        }
        if (a.length % 2 != 0) {
            b[k] = a[i];
        }

        System.out.println(Arrays.toString(b));

    }
}
