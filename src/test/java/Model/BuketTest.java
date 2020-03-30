package Model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BuketTest {
    Buket buket;
    ArrayList<Blomst> blomster;
    Tilbehør tilbehør;

    @Before
    public void setUp() throws Exception {
        /*
                    case "Tulipan": this.pris = 40;break;
            case "Rose": this.pris = 50;break;
            case "Lilje": this.pris = 30;break;
            case "Georgine": this.pris = 10;break;
         */
        blomster = new ArrayList<>();
        Blomst blomst1 = new Blomst("Rose");
        Blomst blomst2 = new Blomst("Tulipan");
        Blomst blomst3 = new Blomst("Tulipan");
        blomster.add(blomst1);
        blomster.add(blomst2);
        blomster.add(blomst3);
        Adresse adresse = null;
        tilbehør = new Tilbehør("Mos");
        buket = new Buket(blomster,tilbehør);
        buket.setPris();
    }

    @Test
    public void getPris() {
        int expected = 150;
        int actual = buket.getPris();
        assertEquals(expected,actual);
    }
}