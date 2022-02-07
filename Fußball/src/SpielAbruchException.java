public class SpielAbruchException extends Exception {
    private int spielminute;

    public SpielAbruchException(int spielminute) {
        this.spielminute = spielminute;
    }

    public int getSpielminute() {
        return spielminute;
    }

    public String getMessage() {
        return "Spiel abbruch in minute " + spielminute + "!";
    }

}
