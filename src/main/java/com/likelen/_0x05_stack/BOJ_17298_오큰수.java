package com.likelen._0x05_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_17298_오큰수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");
        int[] input = new int[s.length];
        int[] result = new int[s.length];

        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(s[i]);
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = input.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= input[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(input[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int j : result) {
            sb.append(j).append(" ");
        }
        System.out.println(sb);
    }
}
