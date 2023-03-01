package com.likelen._0x05_stack;

import java.io.*;
import java.util.Stack;

public class BOJ_1874_스택수열 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());

        int start = 0;
        while (N-- > 0) {
            int v = Integer.parseInt(br.readLine());
            if (v > start) {

                for (int i = start + 1; i <= v; i++) {
                    stack.push(i);
                    sb.append('+').append("\n");
                }
                start = v;
            } else if (stack.peek() != v) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}
