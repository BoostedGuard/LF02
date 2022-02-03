public class Spiel {
    private Mannschaft heim;
    private Mannschaft gast;
    private Ergebnis ergebniss;
    private StringBuilder spielverlauf;

    public Spiel(Mannschaft heim, Mannschaft gast , Ergebnis ergebnis){
        this.heim = heim;
        this.gast = gast;
        this.ergebniss = ergebnis;
    }


    public StringBuilder getSpielverlauf() {
        return spielverlauf;
    }

    public Ergebnis getErgebniss() {
        return ergebniss;
    }

    public Mannschaft getGast() {
        return gast;
    }

    public Mannschaft getHeim() {
        return heim;
    }

    @Override
    public String toString(){
        return "Endergebniss" + getErgebniss() + "\nHeim" + getHeim();
    }
}
