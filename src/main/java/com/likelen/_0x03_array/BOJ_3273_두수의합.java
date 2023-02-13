package com.likelen._0x03_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3273_두수의합 {

    private static int N;
    private static int [] ints;
    private static int x;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ints = new int[N+1];
        for (int i = 0; i < N; i++) {
            ints[i] = Integer.parseInt(st.nextToken());
        }
        x = Integer.parseInt(br.readLine());

        boolean [] tep = new boolean[2000001];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (x-ints[i] > 0 && tep[x-ints[i]]) ans++;
            tep[ints[i]] = true;
        }
        System.out.println(ans);
    }
}
