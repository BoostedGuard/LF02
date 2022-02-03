import java.util.ArrayList;
import java.util.Random;

public class Gameplay {
    private static final int spielzeit = 90;
    private static final int nachspielzeit = 5;
    private static final int dauer = 10;
    private static final int naesteAktion = 10;


    private static int ermittelManschaftsWert(Mannschaft mannschaft){
        Trainer trainer = mannschaft.getTrainer();
        int manschaftswert = mannschaft.getMotivation() * mannschaft.getStaerke() * trainer.getErfahrung();
        if (manschaftswert == 0){
            manschaftswert = 1;
        }
        return manschaftswert;
    }
private static boolean erzieltTor(Spieler schuetze , Torwart torwart){
        boolean erzielttor;
        Random zuffalszahl = new Random();
        int indexR = zuffalszahl.nextInt(5)-2;
        int indexS = zuffalszahl.nextInt(5)-2;

        int torschuss = schuetze.getTorschuss() + indexS;
        if (torschuss == 0){
            torschuss +=1;
        }

        int reaktion = torwart.getReaktion() + indexR;
        if (reaktion == 0){
            reaktion +=1;
        }

        erzielttor = torschuss >= reaktion;

        return erzielttor;
}
public static void spielen (Spiel spiel){
        Random zuffall  = new Random();

        int zeit = zuffall.nextInt(nachspielzeit);
        int aktion = zuffall.nextInt(naesteAktion);
        int j = 0;
        boolean weiter = true;
        do{


            Mannschaft heim= spiel.getHeim();
            int heimwert = ermittelManschaftsWert(heim);
            Mannschaft gast = spiel.getGast();
            int gastwert = ermittelManschaftsWert(gast);
            int gesamtManschaftsWert = heimwert+gastwert;
            Random mannschaftsWerte = new Random();
            int randomMannschaftsWert = mannschaftsWerte.nextInt(gesamtManschaftsWert);

            if (randomMannschaftsWert < heimwert){
                ArrayList<Spieler> arrayHeimmannschaft = heim.getSpielerListe();
                Random r = new Random();
                int rSpieler = r.nextInt(arrayHeimmannschaft.size());
                Spieler schuetze = arrayHeimmannschaft.get(rSpieler);
                Torwart torwart = spiel.getGast().getTorwart();
                boolean torschussH = erzieltTor(schuetze , torwart);
                if (torschussH == true){
                    int torHeim = spiel.getErgebniss().trefferHeim();
                    System.out.println("Tor für die Heimannschaft in Minute "+ j);
                }
                else{
                    System.out.println("Torschuss wurde abgewehrt von "+ gast.getTorwart().getName()+ " in der "+j+" min!");
                }
            }
            if (randomMannschaftsWert > heimwert){
                ArrayList<Spieler> arrayGastmannschaft = gast.getSpielerListe();
                Random r = new Random();
                int index2 = r.nextInt(arrayGastmannschaft.size());
                Spieler spieler = arrayGastmannschaft.get(index2);
                Torwart torwart = spiel.getHeim().getTorwart();
                boolean torschussG = erzieltTor(spieler,torwart);
                if (torschussG == true){
                    int torGast = spiel.getErgebniss().trefferGast();
                    System.out.println("Tor für die Gastmannschaft in Minute "+j);
                }
                else {
                    System.out.println("Torschuss wurde verhindert von der Torwartlegende "+ heim.getTorwart().getName()+ " in der "+j+" min!");
                }
            }

          j+=aktion;
        if (j <= spielzeit){
            weiter = true;
        }
        else if (j > spielzeit){
            weiter = false;
        }
        }while (weiter == true);
}


}
