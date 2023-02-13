package com.likelen._0x03_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11328_strfry {

    private static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            int [] ints = new int[27];
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String s2 = st.nextToken();
            for (int i = 0; i < s.length(); i++) {
                ints[s.charAt(i) - 'a']++;
            }

            for (int i = 0; i < s2.length(); i++) {
                ints[s2.charAt(i) - 'a']--;
            }

//            boolean isPossible = true;
//            for (int anInt : ints) {
//                if (anInt != 0) {
//                    isPossible = false;
//                    break;
//                }
//            }
            boolean b = Arrays.stream(ints)
                    .filter(i -> i != 0)
                    .findFirst().isPresent();
            if (b) {
                System.out.println("Impossible");
            } else {
                System.out.println("Possible");
            }
        }
    }
}
