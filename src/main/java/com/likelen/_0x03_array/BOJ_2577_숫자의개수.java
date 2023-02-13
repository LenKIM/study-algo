package com.likelen._0x03_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2577_숫자의개수 {

    private static int[] ints = new int[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

//        String i = (a * b * c) + "";
//        for (int j = 0; j < i.length(); j++) {
//            int c1 = i.charAt(j) - '0';
//            ints[c1]++;
//        }

        int i = a*b*c;

        while (i > 0) {
            ints[i%10]++;
            i/=10;
        }

        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
