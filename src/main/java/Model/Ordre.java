package Model;

public class Ordre {
    static int orderCounter=12200;
    String customer;
    Buket buket;
    Adresse adresse;
    int ordreId;
    int pris;

    public Ordre(){
        this.ordreId=orderCounter;
        orderCounter++;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setPris() {
        int tmpPris = 0;
        tmpPris = buket.getPris();
        if (adresse != null) {
            tmpPris = tmpPris + 140;
        }
        this.pris=tmpPris;
    }

    public static int getOrderCounter() {
        return orderCounter;
    }

    public Buket getBuket() {
        return buket;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public int getOrdreId() {
        return ordreId;
    }

    public int getPris() {
        return this.pris;
    }

    public static void setOrderCounter(int orderCounter) {
        Ordre.orderCounter = orderCounter;
    }

    public void setBuket(Buket buket) {
        this.buket = buket;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
