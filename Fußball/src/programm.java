import java.util.ArrayList;

public class programm {
    public static void main(String[] args) {

        ArrayList <spieler> spielerListe1 = new ArrayList<spieler>();

        spieler spieler1 = new spieler("Harry" ,23,8, 7,6,26 );
        spielerListe1.add(spieler1);

        spieler1 = new spieler("Franz",35,9,4,9,2);
        spielerListe1.add(spieler1);

        spieler1 = new spieler("Et'o",23,3,8,6,2);
        spielerListe1.add(spieler1);

        spieler1 = new spieler("peter",37,7,6,3,33);
        spielerListe1.add(spieler1);

        torwart torwart = new torwart("Dieter",35,7,9,8);

        trainer trainer = new trainer("Günni" , 45 , 8);

        manschaft manschaft1 = new manschaft("Heim ",trainer,torwart,spielerListe1);




        ArrayList <spieler> spielersliste2 = new ArrayList<>();

        spieler spieler2 = new spieler("Hannes",40,8,6,4,25);
        spielersliste2.add(spieler2);

        spieler2 = new spieler("Markus",32,9,2,7,3);
        spielersliste2.add(spieler2);

        ergebnis ergebnis = new ergebnis();


        System.out.println(manschaft1);

    }
}
