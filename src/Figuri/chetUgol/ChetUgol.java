package Figuri.chetUgol;

import Figuri.Figura;

import java.util.Scanner;

public class ChetUgol extends Figura {
    int a;
    int b;
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите длину: ");
        a= sc.nextInt();
        System.out.println("введите ширину");
        b = sc.nextInt();
    }
    @Override
    public int poiskS() {
        return a * b;
    }

    @Override
    public int poiskP() {
        return (a+b)*2;
    }
}
