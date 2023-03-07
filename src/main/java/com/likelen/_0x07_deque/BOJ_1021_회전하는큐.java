package com.likelen._0x07_deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BOJ_1021_회전하는큐 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        LinkedList<Integer> deque = new LinkedList<>();

        while (N-- > 0) {
            deque.addFirst(N + 1);
        }

        String[] targets = br.readLine().split(" ");

        int count = 0;

        for (String target : targets) {

            int v = Integer.parseInt(target);
            int targetIdx = deque.indexOf(v);

            int halfIdx;
            if (deque.size() % 2 == 0) {
                halfIdx = deque.size() / 2 - 1;
            } else {
                halfIdx = deque.size() / 2;
            }

            if (targetIdx <= halfIdx) {

                for (int i = 0; i < targetIdx; i++) {
                    Integer integer = deque.pollFirst();
                    deque.addLast(integer);
                    count++;
                }

            } else {

                for (int i = 0; i < deque.size() - targetIdx; i++) {
                    Integer integer = deque.pollLast();
                    deque.addFirst(integer);
                    count++;
                }
            }

            deque.pollFirst();

        }
        System.out.println(count);
    }
}
