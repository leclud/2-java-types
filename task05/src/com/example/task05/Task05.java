package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String numberStr = Integer.toString(x);

        // Проверяем каждую цифру
        for (char digit : numberStr.toCharArray()) {
            if ((digit - '0') % 2 != 0) { // Если цифра нечетная
                return "FALSE";
            }
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution(1234);
        System.out.println(result);
        */
    }

}
