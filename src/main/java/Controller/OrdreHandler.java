package Controller;

import Model.Blomst;
import Model.Ordre;
import java.io.File;

import java.util.ArrayList;

public class OrdreHandler {
    public boolean markOrdreDone(Ordre ordre) {
        boolean retval = true;
        return retval;
    }

    public boolean cancelOrdre(Ordre ordre) {
        boolean retval = true;
        return retval;
    }
    public void submitOrderToBestilling(Ordre ordre) {

    }
    public void submitOrdersToFile(File file){

    }
    public double getRevenu(File file) {
        double retVal =  0;
        return retVal;
    }

    public ArrayList<Blomst> getFlowersFromFile(File file) {
        ArrayList<Blomst> blomster = new ArrayList<>();

        return blomster;
    }
}
