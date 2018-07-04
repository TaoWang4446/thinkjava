package com.wangs.unit.test;

public class BobbuSort {
    public static void main(String[] args) {
        int[] ary = {43, 23, 2, 4};
        int temp = 0;
        for (int i = 0; i < ary.length - 1; i++) {
            for (int j = 0; j < ary.length - 1 - i; j++) {
                if (ary[j] > ary[j + 1]) {
                    temp = ary[j + 1];
                    ary[j + 1] = ary[j];
                    ary[j] = temp;
                }
            }
        }

        System.out.println(ary[0] + "," + ary[1] + "," + ary[2] + "," + ary[3]);
    }
}
