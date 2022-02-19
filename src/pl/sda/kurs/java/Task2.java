package pl.sda.kurs.java;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        float srednica = pobierzWartoscSrednica();
        float r = obliczPromien(srednica);
        obliczObwod(r);
        obliczPole(r);

    }

    public static void obliczObwod(float promien) {
        float obwod = (float) (2 * Math.PI * promien);
        System.out.println("Obwod : " + obwod);
    }

    public static void obliczPole(float promien) {
        float pole = (float) (Math.PI * Math.pow(promien, 2));
        System.out.println("Pole : " + pole);
    }

    public static float pobierzWartoscSrednica() {

        Scanner scanner = new Scanner(System.in);
        float srednica;
         srednica = scanner.nextFloat();
        return srednica;
    }

    public static float obliczPromien(float srednica) {
        float r;
        return r = (float) (srednica * 0.5);
    }


}
