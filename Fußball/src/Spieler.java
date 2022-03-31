public class Spieler extends Person {
    private int staerke;
    private int torschuss;
    private int motivation;
    private int bisherTore;
    private String spielerBeschreibung;

    public Spieler(String name, int alter, int staerke, int torschuss, int motivation, int bisherTore) {
        super(name, alter);
        this.staerke = staerke;
        this.torschuss = torschuss;
        this.motivation = motivation;
        this.bisherTore = bisherTore;
    }


    public void setSpielerBeschreibung(String spielerBeschreibung) {
        this.spielerBeschreibung = spielerBeschreibung;
    }

    public String getSpielerBeschreibung() {
        return spielerBeschreibung;
    }

    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    public int getStaerke() {
        return staerke;
    }

    public void setTorschuss(int torschuss) {
        this.torschuss = torschuss;
    }

    public int getTorschuss() {
        return torschuss;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    public int getMotivation() {
        return motivation;
    }

    public void setBisherTore(int bisherTore) {
        this.bisherTore = bisherTore;
    }

    public int getBisherTore() {
        return bisherTore;
    }

    @Override
    public String toString() {

        String text = "\nName  \t\t= " + getName();
        text += "\nAlter  \t\t= " + getAlter();
        text += "\nStärke  \t= " + staerke;
        text += "\nTorschuss\t= " + torschuss;
        text += "\nMotivation\t= " + motivation;
        text += "\nTore \t\t= " + bisherTore;
        text += "\n";
        return text;
    }
}
