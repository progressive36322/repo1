import Figuri.*;
import Figuri.chetUgol.*;
import Figuri.treugol.PryamougTreug;
import Figuri.treugol.RavnobedTreug;
import Figuri.treugol.RavnostoronTreug;
import Figuri.treugol.Treug;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите фигуру: ");
        String fig = sc.nextLine();
        Figura vFig = null;
        if (fig.equals("квадрат")) {
            vFig = new Kvadrat(fig);
        }
        else if (fig.equals("паралелограмм")) {
            vFig = new Parallelogram(fig);
        }
        else if (fig.equals("прямоугольник")) {
            vFig = new Praymougol(fig);
        }
        else if (fig.equals("ромб")) {
            vFig = new Romb(fig);
        }
        else if (fig.equals("трапеция")) {
            vFig = new Trapecia(fig);
        }
        else if (fig.equals("выпуклый четырехугольник")) {
            vFig = new VipukChetUgol(fig);
        }
        else if (fig.equals("прямой треугольник")) {
            vFig = new PryamougTreug(fig);
        }
        else if (fig.equals("равнобедренный треугольник")) {
            vFig = new RavnobedTreug(fig);
        }
        else if (fig.equals("равносторонний треугольник")) {
            vFig = new RavnostoronTreug(fig);
        }
        else if (fig.equals("треугольник")) {
            vFig = new Treug(fig);
        }
        else if (fig.equals("окружность")) {
            vFig = new Okrugnost(fig);
        }
        else if (fig.equals("овал")) {
            vFig = new Oval(fig);
        }
        else if (fig.equals("пятиугольник")) {
            vFig = new PyatiUgol(fig);
        }
        else if (fig.equals("шестиугольник")) {
            vFig = new ShestiUgol(fig);
        }
        else System.out.println("Такой фигуры нет!!!!!!!!!!");
        if (vFig != null) {
            System.out.println("Площадь " + vFig.getName() + " " + vFig.poiskS());
            System.out.println("Периметр " + vFig.getName() + " " + vFig.poiskP());
        }
    }
}
