public class Schmuck extends Gegenstand{
   String bezeichnung;
    public Schmuck (int id, double wert){
        super(id, wert);
        this.bezeichnung = bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    @Override
    public String toString() {
        String text = "Die ID lautet: "+getId();
        text += "\nDer Wert der Aktie beträgt: "+ getWert();
        return text;
    }
}
