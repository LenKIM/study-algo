package com.likelen._0x04_linked_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class BOJ_1406_에디터 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String init = sc.nextLine();

        int M = Integer.parseInt(sc.nextLine());

        List<Character> strings = new ArrayList<>();
        char[] chars = init.toCharArray();
        for (char aChar : chars) {
            strings.add(aChar);
        }
        int cursor = strings.size() - 1;

        for (int i = 0; i < M; i++) {

            String s = sc.nextLine();
            s = s.trim();
            if (s.startsWith("L")) {
                if (cursor == 0) continue;

                cursor = cursor - 1;
            } else if (s.startsWith("D")) {
                if (cursor >= strings.size()) continue;

                cursor = cursor + 1;
            } else if (s.startsWith("B")) {
                if (cursor - 1 < 0) continue;
                strings.remove(cursor - 1);
                cursor = cursor - 1;

            } else if (s.startsWith("P")) {
                char c1 = s.trim().charAt(2);
                strings.add(cursor, c1);
                cursor = cursor + 1;
            }
        }
        String collect = strings.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.print(collect);
    }
}
