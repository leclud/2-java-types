package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int sum = x + y;
        int sumlen = 0;

        while (sum != 0) {
            sumlen++;
            sum /= 10;
        }

        if (sumlen == 0) return 1;
        return sumlen;
    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);

    }

}
