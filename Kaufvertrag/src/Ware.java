import java.util.ArrayList;

public class Ware {
    private String bezeichnung;
    private String beschreibung;
    private double preis;
    private ArrayList<String>besonderheiten;
    private ArrayList<String>maengel;

public Ware(String bezeichnung, double preis){
    this.bezeichnung = bezeichnung;
    this.preis = preis;
    besonderheiten = new ArrayList<String>();
    maengel = new ArrayList<String>();
}

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public double getPreis() {
        return preis;
    }

    public ArrayList<String> getBesonderheiten() {
        return besonderheiten;
    }

    public ArrayList<String> getMaengel() {
        return maengel;
    }

    @Override
    public String toString() {
        return "Ware{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                ", preis=" + preis +
                ", besonderheiten=" + besonderheiten +
                ", maengel=" + maengel +
                '}';
    }
}

