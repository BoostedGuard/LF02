public class Spiel {
    private manschaft heim;
    private manschaft gast;
    private ergebnis ergebniss;
    private StringBuilder spielverlauf;

    public Spiel(manschaft heim, manschaft gast , ergebnis ergebnis){
        this.heim = heim;
        this.gast = gast;
        this.ergebniss = ergebnis;
    }


    public StringBuilder getSpielverlauf() {
        return spielverlauf;
    }

    public ergebnis getErgebniss() {
        return ergebniss;
    }

    public manschaft getGast() {
        return gast;
    }

    public manschaft getHeim() {
        return heim;
    }

    @Override
    public String toString(){
        return "Endergebniss" + getErgebniss() + "\nHeim" + getHeim();
    }
}
