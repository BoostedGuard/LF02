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
private static boolean erzieltTor(spieler schuetze , torwart torwart){
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

        erzielttor = torschuss > reaktion;

        return erzielttor;
}
public static void spielen (Spiel spiel){
        Random zuffall  = new Random();

        int zeit = zuffall.nextInt(nachspielzeit);
        int aktion = zuffall.nextInt(naesteAktion);

        do{
            Mannschaft heim= spiel.getHeim();
            int heimwert = ermittelManschaftsWert(heim);
            Mannschaft gast = spiel.getGast();
            int gastwert = ermittelManschaftsWert(gast);

            if (heimwert < gastwert){

            }


        }
}


}
