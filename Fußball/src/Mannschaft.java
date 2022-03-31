import java.util.ArrayList;

public class Mannschaft {
    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerListe;
    private int manschaftsWert;
    int motivation;
    int motivationdurschnitt;
    int staerke;
    int staerkedurschnitt;

    public Mannschaft(String name, Trainer trainer, Torwart torwart, ArrayList<Spieler> spielerListe) {
        this.name = name;
        this.torwart = torwart;
        this.trainer = trainer;
        this.spielerListe = spielerListe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTorwart(Torwart torwart) {
        this.torwart = torwart;
    }

    public Torwart getTorwart() {
        return torwart;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setSpielerListe(ArrayList<Spieler> spielerListe) {
        this.spielerListe = spielerListe;
    }

    public ArrayList<Spieler> getSpielerListe() {
        return spielerListe;
    }

    public int getMotivation() {
        motivation = 0;
        for (Spieler i : spielerListe) {
            motivation += i.getMotivation();
        }
        motivation += torwart.getMotivation();
        motivationdurschnitt = motivation / (spielerListe.size() + 1);
        return motivationdurschnitt;
    }

    public int getStaerke() {
        staerke = 0;
        for (Spieler i : spielerListe) {
            staerke += i.getStaerke();
        }
        staerke += torwart.getStaerke();
        staerkedurschnitt = staerke / (spielerListe.size() + 1);
        return staerkedurschnitt;
    }


    @Override
    public String toString() {

        String text = getName();
        text += "\n===========================";
        text += "\nTorwart:\n" + torwart;
        text += "\n===========================";
        text += "\nSpieler:\n" + spielerListe;
        text += "\n===========================";
        text += "\nTrainer:\n" + trainer;
        text += "\n===========================";
        text += "\nStärkedurschnitt = " + getStaerke() + "\nMotivationsdurschnitt = " + getMotivation();
        text += "\n===========================\n\n\n\n";
        return text;

    }
}

