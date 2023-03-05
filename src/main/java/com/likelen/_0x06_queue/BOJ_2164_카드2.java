package com.likelen._0x06_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class BOJ_2164_카드2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        while (N-- > 0) {
            deque.addFirst(N+1);
        }

        while (deque.size() != 1) {
            deque.pollFirst();
            Integer first = deque.pollFirst();
            deque.addLast(first);
        }
        System.out.println(deque.peek());
    }
}
