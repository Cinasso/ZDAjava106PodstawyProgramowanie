package pl.sda.kurs.java;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int x = getInt();
        int y = getInt();

        System.out.println("Is x bigger than Y ? : "+ ifXbiggerThanY(x, y));
        System.out.println("Is X*3 bigger than y ? : "+ xTimes3biggerThanY(x, y));
        System.out.println("Is blablablablabala : "+ MixedCrap(x,y));
        System.out.println("Is x * y even ? : "+ powerX_Y(x,y));


    }


    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        return a;
    }

    public static boolean ifXbiggerThanY(int x, int y) {
        if ((x > y)) ;
        return true;
    }

    public static boolean xTimes3biggerThanY(int x, int y) {
        if (((x * 3) > y)) ;
        return true;
    }

    public static boolean MixedCrap(int x, int y) {
        int b = y++;
        int c = ++x;
        int e = --x;
        if ((b > c) && (e < b)) ;
        return true;
    }

    public static boolean powerX_Y (int x, int y){
        int powerXY=x*y;
        if ((powerXY%2)==0);
        return true;
    }
}
