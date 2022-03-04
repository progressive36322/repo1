package Figuri.treugol;

import Figuri.Figura;

import java.util.Scanner;

public class Treug extends Figura {
    int a;
    int b;
    int c;
    int p;
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 1-ю сторону: ");
        a = sc.nextInt();
        System.out.print("Введите 2-ю сторону: ");
        b = sc.nextInt();
        System.out.print("Введите 3-ю сторону: ");
        c = sc.nextInt();
        p = (a + b + c) / 2;
    }
    public Treug(String fig) {
        setName(fig);
    }

    @Override
    public Double poiskS() {
        return  Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public int poiskP() {
        return a+b+c;
    }
}
