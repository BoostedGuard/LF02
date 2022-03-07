public class Schmuck extends Gegenstand{
   String bezeichnung;
    public Schmuck (String id, double wert){
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
        return "1";
    }
}
