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
        System.out.println("Введите фигуру: ");
        String fig = sc.nextLine();
        Object vFig = new Figura(fig);


    }
}
