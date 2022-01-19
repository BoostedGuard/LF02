import javax.print.DocFlavor;

public abstract class obst {
    private String name;
    private double gewicht;
    private String farbe;
    private Boolean reif;

    public obst(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public Boolean isReif() {
        return reif;
    }

    public void setReif(Boolean reif) {
        this.reif = reif;
    }
    @Override
    public String toString(){
    String text = "    Name = "+ name;
    text += "\n   Farbe = " + farbe;
    text += "\n Gewicht = "+ gewicht;
    text += "\n\tReif = "+ reif;
    return text;
    }
}


