package ru.sbrf.lesson;


// Занятие 2, задание 4
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        byte a = 3;
        short b = 4;
        int c = 30, d = 3;
        long e = 15;
        char s = '1', f = 'A';
        System.out.println(sum(a, b));
        System.out.println(sum(a, e));
        System.out.println(getMaxNumber(c, d));
        System.out.println(isCharA(s));
        System.out.println(isCharNumber(s));
        System.out.println(Character.getNumericValue(f)); // Занятие 3, задание 11
        System.out.println(Character.toChars(c)); // Занятие 3, задание 12
    }

    //Занятие 3, задание 4
    public static byte sum(byte x, short y) {
        byte sum = (byte) (x + y);
        return sum;
    }

    // Занятие 3, задание 5
    public static int sum(int x, long y) {
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

    // Занятие 3, задание 7
    public static boolean isCharA(char x) {
        boolean symbol;
        if (x == 'A')
            symbol = true;
        else
            symbol = false;
        return symbol;
    }

    // Занятие 3, задание 8
    public static boolean isCharNumber(char x) {
        return Character.isDigit(x);
    }

    // Занятие 3, задание 9
    public void binaryCycle() {
        for (int i = 0; i < 31; i++)
            System.out.println(Integer.toBinaryString(i));
    }


}







