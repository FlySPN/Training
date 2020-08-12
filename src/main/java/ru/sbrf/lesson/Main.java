package ru.sbrf.lesson;


// Занятие 2, задание 4
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        byte a = 3;
        short b = 4;
        int c = 2, d = 3;
        long e = 15;
        System.out.println(sum(a, b));
        System.out.println(sum2(a, e));
        System.out.println(getMaxNumber(c, d));

    }


    //Занятие 3, задание 4
    public static byte sum(byte x, short y) {
        byte sum = (byte) (x + y);
        return sum;
    }

    // Занятие 3, задание 5
    public static int sum2(int x, long y) {
        int sum2 = (int) (x + y);
        return sum2;
    }

    // Занятие 3, задание 6
    public static int getMaxNumber(int x, int y) {
        int max;
        if (x > y)
            max = x;
        else
            max = y;
        return max;
    }


}







