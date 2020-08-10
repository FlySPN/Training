package ru.sbrf.lesson;


// Занятие 2, задание 4
public class Main {
    // Занятие 3, задание 6
    public static int getMaxNumber(int x, int y) {
        int max;
        if (x > y)
            max = x;
        else
            max = y;
        return max;
    }

    public void main(String[] args) {
        System.out.println("Hello world!");
        byte a = 2;
        short b = 3;
        int c = 5, d = 6;
        long e = 7;

    }

    //Занятие 3, задание 4
    public byte sum(byte x, short y) {
        byte sum = (byte) (x + y);
        return sum;
    }

    // Занятие 3, задание 5
    public int sum2(int x, long y) {
        int z = (int) (x + y);
        return z;
    }

}






