package Controller;

import Model.*;
import View.View;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import Util.SystemUI;

public class MainController {

    int choice;
    View view;
    SystemUI ui;
    OrdreHandler ordreHandler;
    Bestillinger bestillinger ;
    ArrayList<Blomst> importedFlowers ;
    ArrayList<String> orderedFlowers ;
    ArrayList<String> orderedTilbehør ;
    ArrayList<Blomst> myBlomster ;

    public MainController(View view, SystemUI ui, Bestillinger bestillinger) {

        this.view = view;
        this.ui = ui;
        this.bestillinger = bestillinger;
        this.importedFlowers = new ArrayList<>();
        this.orderedFlowers = new ArrayList<>();
        this.orderedTilbehør = new ArrayList<>();
        this.ordreHandler = new OrdreHandler();
        File file = new File("Data/blomster.csv");
        importedFlowers = ordreHandler.getFlowersFromFile(file);
        choice = 0;
    }

    public void run() {
        boolean runDay = true;
        while(runDay) {
            view.visHovedMenu();
            choice = ui.getInputInt();
            switch (choice) {
                case 1: handleOrders();break;
                case 2: handleStatistics();break;
                case 3: handleImports();break;
                case 9: runDay = false;break;
                default: runDay = false;
            }

            // TODO: gøre databeholdere klar til dagens handel

        }
    }

    public void createOrder() {
        int createChoice = 0;
        Ordre tmpOrdre = new Ordre();
        Buket tmpBuket = new Buket();
        int exitValue = 9;
        view.opretOrdre();
        createChoice = ui.getInputInt();
        while (createChoice != exitValue) {
            switch (createChoice) {
                case 1:
                    String customer = ui.getInputString("Enter phone number");
                    tmpOrdre.setCustomer(customer);
                    break;
                case 2:
                    view.showFlowers();
                    orderedFlowers = view.getFlowers();
                    for(String s: orderedFlowers) {
                        myBlomster.add(new Blomst(s));
                    }
                    tmpBuket.setBlomster(myBlomster);
                    break;
                case 3:
                    view.showTilbehør();
                    orderedTilbehør.add(view.getTilbehør());
                    Tilbehør tilbehør = new Tilbehør(orderedTilbehør.get(0));
                    /*
                    for(String s: orderedFlowers) {
                        myBlomster.add(new Blomst(s));
                    }
                     */
                    tmpBuket.setBlomster(myBlomster);
                    tmpBuket.setTilbehør(tilbehør);
                    break;
                case 4:
                    ui.showMessage(tmpBuket.toString());
                    ui.showMessage("Confirm?");
                    int okval = ui.getInputInt("Tast 1 for ok, 0 for ikke-ok");
                    if (okval==1) {
                        createChoice = exitValue;
                    } else {
                        tmpBuket = new Buket();
                    }
                    break;
                default:
                    createChoice = exitValue;
            }
        }
        bestillinger.addOrder(tmpOrdre);
    }

    public Ordre confirmOrder() {
        int searchId = ui.getInputInt();
        Ordre retValOrdre = null;
        for (Ordre o : bestillinger.getOrders()) {
            if (o.getOrdreId() == orderid) {
                retValOrdre = o;
                return retValOrdre;
            }
        }
        return retValOrdre;
    }

    public Ordre findOrder() {
        int searchId = ui.getInputInt();
        Ordre retValOrdre = null;
        for(Ordre o : bestillinger.getOrders()) {
            if (o.getOrdreId() == orderid) {
                retValOrdre = o;
                return retValOrdre;
            }
        }
        return retValOrdre;
    }

    public void handleOrders() {
        boolean takeOrder = true;
        int orderChoice=0;
        int exitValue=9;

        while(takeOrder) {
            view.ordreMenu();
            orderChoice = ui.getInputInt();
            while (orderChoice!=exitValue) {
                switch (orderChoice) {
                    case 1:
                        createOrder();
                        break;
                    case 2:
                        findOrder();
                        break;
                    case 3:
                        confirmOrder(); break;
                    case 4:
                        showActiveOrders();
                        break;
                    case 5:
                        showAllOrders();
                        break;
                    case 6:
                        storeAllOrdersToStorage();
                        break;
                    case 7:
                        loadDataForMenus();
                        break;
                    case 9:
                        takeOrder = false;
                        break;
                    default:
                        takeOrder = false;
                        break;

                }
            }

            orderedFlowers = view.getFlowers();
            for( s: b) {
                Blomst tmpBlomst = new Blomst(s);
                myBlomster.add(tmpBlomst);
            }
            //String userFlower = view.getFlower();
            String tilbeHoer = view.getTilbehør();
            Tilbehør tilbehør = new Tilbehør(tilbeHoer);
            // Model.Adresse?
            Adresse address = null;
            Buket buket = new Buket(myBlomster,tilbehør);
            buket.setPris();
            //int buketPris = buket.getPris();
            //boolean ok = view.getConfirmation(buketPris);
            Ordre order = new Ordre();
            order.setBuket(buket);
            order.setAdresse(address);
            order.setPris();
            System.out.println(order.getPris());
            // gem ordrer .. hvor?


            // validering af ordre
            // afgivelse af ordre

            takeOrder=false;
        }
    }

    public void handleStatistics() {

    }

    public void handleImports() {

    }

}
/*
@startuml
class MainController {
- view : View
- bestillinger : ArrayList<Ordre>
- flowers : ArrayList<String>
- myBlomster:  ArrayList<Blomst>
--
--
run() : void
}

@enduml
 */
    }
public void handleStatistics() {

        }

public void handleImports() {

        }

        }
/*
@startuml
class MainController {
- view : View
- bestillinger : ArrayList<Ordre>
- flowers : ArrayList<String>
- myBlomster:  ArrayList<Blomst>
--
--
run() : void
}

@enduml
 */
