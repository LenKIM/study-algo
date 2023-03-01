package com.likelen._0x05_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10773_제로 {

    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            int command = Integer.parseInt(br.readLine());
            if (command == 0) {
                stack.pop();
            } else {
                stack.push(command);
            }
        }

        int sum = stack.stream().mapToInt(a -> a).sum();
        System.out.println(sum);
    }
}
