public class Spiel {
    private int heim;
    private int gast;
    private int ergebniss;
    private StringBuilder spielverlauf;


    public StringBuilder getSpielverlauf() {
        return spielverlauf;
    }

    public int getErgebniss() {
        return ergebniss;
    }

    public int getGast() {
        return gast;
    }

    public int getHeim() {
        return heim;
    }

    @Override
    public String toString(){
        return "Endergebniss" + getErgebniss() + "\n"
    }
}
