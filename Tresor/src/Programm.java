import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {
        ArrayList<Gegenstand> tresorInhalt = new ArrayList<>();
        Schmuck uhr = new Schmuck(3567,12700);
        Schmuck kette = new Schmuck(3425,540);
        Aktie ikea = new Aktie(8731,7200,"Ikea",900);
        Aktie audi = new Aktie(9238,6900,"Audi GmbH",700);

        Tresor tresor = new Tresor(tresorInhalt);
        tresor.addGegenstand(uhr);
        tresor.addGegenstand(kette);
        tresor.addGegenstand(ikea);
        tresor.addGegenstand(audi);
        System.out.println(tresor);

        }
    }

