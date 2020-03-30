package Model;

import java.util.ArrayList;

public class Buket {
    Blomst blomst;
    ArrayList<Blomst> blomster;
    Tilbehør tilbehør;
    int pris;

    public Buket() {
    }

    private Buket(Blomst blomst, Tilbehør tilbehør) {
        this.blomst = blomst;
        this.tilbehør=tilbehør;
        this.tilbehør=tilbehør;
    }
    public Buket(ArrayList<Blomst> blomster, Tilbehør tilbehør) {
        this.blomster = new ArrayList<>();
        this.blomster = blomster;
        this.tilbehør=tilbehør;
    }

    public void setPris() {
        int tmpPris = 0;
        for(Blomst b :  this.blomster) {
            tmpPris=tmpPris+b.getPris();
        }
        tmpPris = tmpPris + tilbehør.getPris();
        this.pris = tmpPris;
    }

    public void setBlomst(Blomst blomst) {
        this.blomst = blomst;
    }

    public ArrayList<Blomst> getBlomster() {
        return blomster;
    }

    public void setBlomster(ArrayList<Blomst> blomster) {
        this.blomster = blomster;
    }

    public void setTilbehør(Tilbehør tilbehør) {
        this.tilbehør = tilbehør;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public Blomst getBlomst() {
        return blomst;
    }

    public Tilbehør getTilbehør() {
        return tilbehør;
    }

    public int getPris() {
        return pris;
    }
}

/*
class Buket {
- blomster:ArrayList<blomst>
- tilbehør:Tilbehør
- pris:int
--
+ Buket(Blomst,Tilbehør)
--
+ setPris():void
}
 */