import java.util.ArrayList;

public class manschaft {
    private String name;
    private trainer trainer;
    private torwart torwart;
    private ArrayList<spieler> spielerListe;
    int motivation;
    int motivationdurschnitt;
    int staerke;
    int staerkedurschnitt;

    public manschaft(String name , trainer trainer, torwart torwart ){
        this.name = name;
        this.torwart = torwart;
        this.trainer = trainer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTorwart(torwart torwart) {
        this.torwart = torwart;
    }

    public torwart getTorwart() {
        return torwart;
    }

    public void setTrainer(trainer trainer) {
        this.trainer = trainer;
    }

    public trainer getTrainer() {
        return trainer;
    }

    public void setSpielerListe(ArrayList<spieler> spielerListe) {
        this.spielerListe = spielerListe;
    }

    public ArrayList<spieler> getSpielerListe() {
        return spielerListe;
    }
    public int getMotivation(){
        for (spieler s: spielerListe) {
        motivation += s.getMotivation();
        }
         motivation += torwart.getMotivation();
        motivationdurschnitt = motivation / (spielerListe.size()+1);
        return motivationdurschnitt;
    }
    public int getStaerke(){
        for (spieler s: spielerListe){
            staerke += s.getStaerke();
        }
        staerke += torwart.getStaerke();
        staerkedurschnitt = staerke / (spielerListe.size()+1);
        return staerkedurschnitt;
    }

}

