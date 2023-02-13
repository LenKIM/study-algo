package com.likelen._0x03_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13300_방배정 {

    public static void main(String[] args) throws IOException {
        int N, K;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 학생 수
        K = Integer.parseInt(st.nextToken()); // 방 하나에 들어갈 수 있는

        int[] man = new int[7];
        int[] woman = new int[7];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int z = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());

            if (z == 0) {
                man[grade]++;
            } else {
                woman[grade]++;
            }
        }

        int ans = 0;
        for (int i = 0; i < 7; i++) {
            int i1 = man[i];
            int i3 = i1 % K;
            int x = i1 / K;
            if (i3 > 0) {
                x++;
            }
            ans = ans + x;
            int i2 = woman[i];
            int i4 = i2 % K;
            int i5 = i2 / K;
            if (i4 > 0) {
                i5++;
            }
            ans = ans + i5;
        }
        System.out.println(ans);


    }
}
