package com.likelen._0x05_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_3015_오아시스재결합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Pair<Integer, Integer>> stack = new Stack<>();
        long ans = 0;

        while (N-- > 0) {
            int h = Integer.parseInt(br.readLine());
            int cnt = 1;
            while (!stack.isEmpty() && stack.peek().left <= h) {
                ans += stack.peek().right;
                if (stack.peek().left == h) {
                    cnt += stack.peek().right;
                }
                stack.pop();
            }
            if (!stack.isEmpty()) ans++;
            stack.push(new Pair<>(h, cnt));
        }
        System.out.println(ans);
    }

    private static class Pair<L, R> {

        L left;
        R right;

        public Pair(L left, R right) {
            this.left = left;
            this.right = right;
        }
    }

}
