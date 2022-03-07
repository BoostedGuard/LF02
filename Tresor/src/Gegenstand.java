public abstract class Gegenstand {
    private String id;
    private double wert;

    public Gegenstand(String id, double wert){
        this.id = id;
        this.wert = wert;
    }

    public String getId() {
        return id;
    }

    public void setWert(double wert) {
        this.wert = wert;
    }

    public double getWert() {
        return wert;
    }

    @Override
    public String toString() {
        return "Die ID ist "+id+ " der Wert ist "+wert;
    }
}
