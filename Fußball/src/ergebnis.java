public class ergebnis {
    private int punkteHeim;
    private int punkteGast;
    int trefferHeim;
    int trefferGast;

    public int getPunkteHeim() {
        return punkteHeim;
    }

    public int getPunkteGast() {
        return punkteGast;
    }

    public int trefferHeim(){
        trefferHeim += 1;
        punkteHeim += trefferHeim;
        return punkteHeim;
    }
    public int trefferGast(){
        trefferGast += 1;
        punkteGast += trefferGast;
        return punkteGast;
    }

    @Override
    public String toString() {
        String text = "\nergebnis Heim = "+ punkteHeim;
        text += "\n Ergebnis Gast = "+ punkteGast;
        return text;
    }
}
