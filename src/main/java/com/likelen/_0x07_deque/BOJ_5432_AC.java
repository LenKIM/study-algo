package com.likelen._0x07_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BOJ_5432_AC {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (N-- > 0) {
            ArrayDeque<Integer> deque = new ArrayDeque<>();
            char[] command = br.readLine().toCharArray();
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");

            for (int i = 0; i < n; i++) {
                deque.add(Integer.valueOf(st.nextToken()));
            }

            boolean isDeleteLeftFrom = true;
            for (char c : command) {
                if (c == 'R') {
                    isDeleteLeftFrom = !isDeleteLeftFrom;
                    continue;

                }

                if (isDeleteLeftFrom) {

                    if (deque.pollFirst() == null) {
                        sb.append("error\n");
                        return;
                    }
                } else {

                    if (deque.pollLast() == null) {
                        sb.append("error\n");
                        return;
                    }
                }
            }

            sb.append("[");

            if (deque.size() > 0) {
                if (isDeleteLeftFrom) {
                    sb.append(deque.pollFirst());

                    while (!deque.isEmpty()) {
                        sb.append(",").append(deque.pollFirst());
                    }
                } else {
                    sb.append(deque.pollLast());

                    while (!deque.isEmpty()) {
                        sb.append(",").append(deque.pollLast());
                    }
                }
            }
            sb.append("]\n");
        }
        System.out.println(sb);
    }
}
