package Figuri;

import Figuri.chetUgol.*;
import Figuri.treugol.PryamougTreug;
import Figuri.treugol.RavnobedTreug;
import Figuri.treugol.RavnostoronTreug;
import Figuri.treugol.Treug;

public abstract class Figura {
    private String name;
    private int S;
    private int P;
    Figura vFig;
    public abstract Double poiskS();
    public abstract int poiskP();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
