public class Schmuck extends Gegenstand{
   String bezeichnung;
    public Schmuck (int id, double wert, String bezeichnung){
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
       return super.toString()+
               "\nBezeichnung: "+ getBezeichnung()+
               "\n----------------";
    }
}
