import Model.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class OrdreTest {
    Ordre ordre;
    Blomst blomst;
    ArrayList<Blomst> blomster;
    Adresse adresse;
    Buket buket;
    Tilbehør tilbehør;

    @Before
    public void setUp() throws Exception {
        blomst = new Blomst("Rose");
        adresse = null;
        tilbehør = new Tilbehør("Mos");
        blomster.add(blomst);
        buket = new Buket(blomster,tilbehør);
        buket.setPris();
        ordre = new Ordre();
        ordre.setBuket(buket);
        ordre.setAdresse(adresse);
        ordre.setPris();
    }

    @Test
    public void getPris() {
        int expected = 70;
        //int actual = 70;
        int actual = ordre.getPris();
        assertEquals(expected,actual);
    }
}