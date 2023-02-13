package com.likelen._0x03_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1475_방번호 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int [] a = new int[10];
        for (int i = 0; i < input.length(); i++) {
            int i1 = input.charAt(i) - '0';
            a[i1]++;
        }

        int ans = 0;

        for (int i = 0; i < 10; i++) {
            if (i == 6 || i == 9) continue;
            ans = Math.max(ans, a[i]);
        }

        ans = Math.max(ans, (a[6] + a[9] + 1 ) / 2);
        System.out.println(ans);

    }
}
