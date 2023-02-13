package com.likelen._0x03_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10807_개수세기 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] ints = new int[200 + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (N-- > 0) {
            int t;
            t = Integer.parseInt(st.nextToken());
            ints[t + 100]++;
        }
        int v = Integer.parseInt(br.readLine());
        System.out.println(ints[v + 100]);
    }
}
