package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bestillinger {
    ArrayList<Ordre> orders;
    LocalDate date;

    public Bestillinger() {
        orders = new ArrayList<>();
        date = LocalDate.now();
    }

    public void addOrder(Ordre order) {
        orders.add(order);
    }

    public ArrayList<Ordre> getOrders() {
        return orders;
    }

}
