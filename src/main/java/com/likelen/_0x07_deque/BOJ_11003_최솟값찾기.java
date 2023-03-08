package com.likelen._0x07_deque;

import java.io.*;
import java.util.*;

public class BOJ_11003_최솟값찾기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        Deque<int[]> deque = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            while (!deque.isEmpty()
                    && deque.peekLast()[1] > num) {
                deque.pollLast();
            }

            deque.addLast(new int[]{i, num});

            if (deque.peekFirst()[0] < i - (L - 1)) {
                deque.pollFirst();
            }

            bw.write(deque.peekFirst()[1] + " ");
        }
        bw.flush();
        bw.close();


    }


}
