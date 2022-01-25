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

    public manschaft(String name , trainer trainer, torwart torwart, ArrayList spielerListe ){
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
        for (spieler i: spielerListe) {
        motivation += i.getMotivation();
        }
         motivation += torwart.getMotivation();
        motivationdurschnitt = motivation / (spielerListe.size()+1);
        return motivationdurschnitt;
    }
    public int getStaerke(){
        for (spieler i: spielerListe){
            staerke += i.getStaerke();
        }
        staerke += torwart.getStaerke();
        staerkedurschnitt = staerke / (spielerListe.size()+1);
        return staerkedurschnitt;
    }


    @Override
    public String toString() {

        String text = getName()+"\n";
        text += "___________________________";
        text +="\n"+spielerListe+"\n";
        text += "___________________________";
        text += "\nStärkedurschnitt = "+ getStaerke()+ "\nMotivationsdurschnitt = "+getMotivation();
        return text;

    }
}

