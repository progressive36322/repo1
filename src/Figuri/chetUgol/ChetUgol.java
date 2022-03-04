package Figuri.chetUgol;

import Figuri.Figura;

import java.util.Scanner;

public class ChetUgol extends Figura {
    int a;
    int b;
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину: ");
        a = sc.nextInt();
        System.out.print("Введите ширину: ");
        b = sc.nextInt();
    }
    @Override
    public Double poiskS() {
        return Double.valueOf(a * b);
    }

    @Override
    public int poiskP() {
        return (a+b)*2;
    }
}
