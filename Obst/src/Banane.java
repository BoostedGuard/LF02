public class Banane extends obst {
    private double kruemmung;

    public Banane() {
        super("Banene");
    }

    public double getKruemmung() {
        return kruemmung;
    }

    public void setKruemmung (double kruemmung) {
        this.kruemmung = kruemmung;
    }
    @Override
    public String toString(){
        String text = super.toString();
        text += "\nKrümmung = "+kruemmung;
        return text;
    }
}

