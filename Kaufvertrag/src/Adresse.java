public class Adresse {
private String strasse;
private String hausNR;
private String plz;
private String ort;

public Adresse(String strasse , String hausnummer, String postleitzahl, String ort){
    this.strasse = strasse;
    this.hausNR = hausnummer;
    this.plz = postleitzahl;
    this.ort = ort;
}

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setHausNR(String hausnummer) {
        this.hausNR = hausnummer;
    }

    public String getHausNR() {
        return hausNR;
    }

    public void setPostleitzahl(String postleitzahl) {
        this.plz = postleitzahl;
    }

    public String  getPostleitzahl() {
        return plz;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getOrt() {
        return ort;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "strasse='" + strasse + '\'' +
                ", hausnummer=" + hausNR +
                ", postleitzahl=" + plz +
                ", ort='" + ort + '\'' +
                '}';
    }
}
