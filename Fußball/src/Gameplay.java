import java.util.Random;

public class Gameplay {
    private static final int spielzeit = 90;
    private static final int nachspielzeit = 5;
    private static final int dauer = 10;
    private static final int naesteAktion = 5;


    private static int ermittelManschaftsWert(manschaft mannschaft){
        int manschaftswert = mannschaft.getMotivation() * mannschaft.getStaerke();
        return manschaftswert;
    }
private static boolean erzieltTor(spieler schuetze , torwart torwart){
        Random zuffalszahl = new Random();
        int indexR = zuffalszahl.nextInt(5)-2;
        int indexS = zuffalszahl.nextInt(5)-2;

        spieler spieler = spieler.getTorschuss() + indexS;

}


}
