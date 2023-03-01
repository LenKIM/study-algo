package com.likelen._0x05_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10828_스택 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        while (N-- > 0) {
            String s = br.readLine();
            if (s.startsWith("push")) {
                String[] s1 = s.split(" ");
                stack.push(Integer.parseInt(s1[1]));
            } else if (s.startsWith("top")) {

                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.peek());
                }
            } else if (s.startsWith("size")) {
                System.out.println(stack.size());
            } else if (s.startsWith("empty")) {
                if (stack.empty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (s.startsWith("pop")) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else {
                    Integer pop = stack.pop();
                    System.out.println(pop);
                }
            }
        }
    }
}
