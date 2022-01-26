public class Gameplay {
    private static final int spielzeit = 90;
    private static final int nachspielzeit = 5;
    private static final int dauer = 10;


    private static int ermittelManschaftsWert(manschaft mannschaft){
        int manschaftswert = mannschaft.getMotivation() * mannschaft.getStaerke();
        return manschaftswert;
    }



}
