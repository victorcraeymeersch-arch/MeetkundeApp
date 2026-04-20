import java.util.*;

public class MeetkundeApp {
    public static void main(String[] args) {
        // We gebruiken de interface als type voor de lijst [cite: 813]
        List<Vorm> vormen = new ArrayList<>();

        vormen.add(new Cirkel(5.0));
        vormen.add(new Rechthoek(10.0, 2.0));

        for (Vorm v : vormen) {
            // We hoeven niet te weten of het een cirkel of rechthoek is [cite: 579, 580]
            System.out.println("De oppervlakte van de " + v.getNaam() + " is: " + v.berekenOppervlakte());
        }
    }
}