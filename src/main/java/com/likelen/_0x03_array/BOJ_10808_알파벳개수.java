package com.likelen._0x03_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10808_알파벳개수 {

    private static final int [] alphabet = new int[26];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int i1 = c - 'a';
            alphabet[i1]++;
        }

        for (int x:
             alphabet) {
            System.out.printf(x + " ");
        }
    }
}
