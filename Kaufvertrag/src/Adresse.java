public class Adresse {
private String strasse;
private int hausnummer;
private int postleitzahl;
private String ort;

public Adresse(String strasse , int hausnummer, int postleitzahl, String ort){
    this.strasse = strasse;
    this.hausnummer = hausnummer;
    this.postleitzahl = postleitzahl;
    this.ort = ort;
}

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public void setPostleitzahl(int postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public int getPostleitzahl() {
        return postleitzahl;
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
                ", hausnummer=" + hausnummer +
                ", postleitzahl=" + postleitzahl +
                ", ort='" + ort + '\'' +
                '}';
    }
}
