package View;

import Model.Blomst;

import java.util.ArrayList;
import java.util.Scanner;
public class View {
    static Scanner ms = new Scanner(System.in);


    public String getFlower(){
        String retFlower = "";
        System.out.println("Du kan vælge:");
        showFlowers();
        retFlower = ms.nextLine();
        return  retFlower;
    }

    public ArrayList<String> getFlowers(){
        ArrayList<String> retFlower = new ArrayList<>();
        String tmpFlower = "";
        System.out.println("Du kan vælge:");
        showFlowers();
        System.out.println("Tast Slut for at sluttte");
        do {
            tmpFlower = ms.nextLine();
            retFlower.add(tmpFlower);
        }
        while (!tmpFlower.equals("Slut"));
        System.out.println("Exit flowers");
        return retFlower;
    }
    public void showFlowers(ArrayList<Blomst> blomster) {
        for (Blomst b: blomster) {
            System.out.println(b.getName());
        }
    }
    public void ordreMenu() {
        System.out.println("");
        System.out.println("Vælg en af følgende valgmuligheder: ");
        System.out.println("2: opret ordre");
        System.out.println("3: find ordre");
        System.out.println("4: afslut ordre");
        System.out.println("5: vis aktive ordrer");
        System.out.println("6: vis alle ordrer");
        System.out.println("7: gem dagens ordrer");
        System.out.println("9: Afslut");
    }

    public void opretOrdre() {
        System.out.println("");
        System.out.println("Vælg en af følgende valgmuligheder: ");
        System.out.println("1: opret kunde på tlfnr");
        System.out.println("2: vælg blomster");
        System.out.println("3: vælg tilbehør");
        System.out.println("9: Afslut");
    }


    public void visHovedMenu() {
            System.out.println("");
            System.out.println("Vælg en af følgende valgmuligheder: ");
            System.out.println("1: håndter ordrelisten");
            System.out.println("2: vis omsætning");
            System.out.println("3: importer data");
            System.out.println("9: Afslut");
        }


    public void showFlowers() {
        System.out.println("Tulipan");
        System.out.println("Rose");
        System.out.println("Lilje");
        System.out.println("Georgine");
    }

    public String getTilbehør(){
        String retTilbehør = "";
        System.out.println("Du kan vælge:");
        showTilbehør();
        retTilbehør = ms.nextLine();
        return  retTilbehør;
    }

    public void showTilbehør() {
        System.out.println("Ramsløg");
        System.out.println("Mos");
        System.out.println("Gran");
        System.out.println("Græs");
    }

}
/*
@startuml
class View {
--
--
showFlowers() : void
getTilbehør() : String
}

@enduml
 */

