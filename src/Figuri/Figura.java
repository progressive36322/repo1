package Figuri;

import Figuri.chetUgol.*;
import Figuri.treugol.PryamougTreug;
import Figuri.treugol.RavnobedTreug;
import Figuri.treugol.RavnostoronTreug;
import Figuri.treugol.Treug;

public class Figura {
        private String name;
        private int S;
        private int P;
        Object vFig;
    public Figura(String fig) {
        if (fig.equals("четырехугольник")) {
            vFig = new ChetUgol(fig);
        }
        else if (fig.equals("квадрат")) {
            vFig = new Kvadrat();
        }
        else if (fig.equals("паралелограмм")) {
            vFig = new Parallelogram();
        }
        else if (fig.equals("прямоугольник")) {
            vFig = new Praymougol();
        }
        else if (fig.equals("ромб")) {
            vFig = new Romb();
        }
        else if (fig.equals("трапеция")) {
            vFig = new Trapecia();
        }
        else if (fig.equals("выпуклый четырехугольник")) {
            vFig = new VipukChetUgol();
        }
        else if (fig.equals("прямой треугольник")) {
            vFig = new PryamougTreug();
        }
        else if (fig.equals("равнобедренный треугольник")) {
            vFig = new RavnobedTreug();
        }
        else if (fig.equals("равносторонний треугольник")) {
            vFig = new RavnostoronTreug();
        }
        else if (fig.equals("треугольник")) {
            vFig = new Treug();
        }
        else if (fig.equals("окружность")) {
            vFig = new Okrugnost();
        }
        else if (fig.equals("овал")) {
            vFig = new Oval();
        }
        else if (fig.equals("пятиугольник")) {
            vFig = new PyatiUgol();
        }
        else if (fig.equals("шестиугольник")) {
            vFig = new ShestiUgol();
        }
        else System.out.println("Такой фигуры нет!!!!!!!!!!");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getS() {
        return S;
    }

    public void setS(int s) {
        S = s;
    }

    public int getP() {
        return P;
    }

    public void setP(int p) {
        P = p;
    }
}
