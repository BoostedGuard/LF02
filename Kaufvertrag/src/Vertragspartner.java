public class Vertragspartner {
    String vorname;
    String nachname;
    String ausweisNr;
    Adresse adresse;

    public Vertragspartner( String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAusweisNr(String ausweisNr) {
        this.ausweisNr = ausweisNr;
    }

    public String getAusweisNr() {
        return ausweisNr;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getVorname() {
        return vorname;
    }

    @Override
    public String toString() {
        return "Vertragspartner{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", ausweisNR='" + ausweisNr + '\'' +
                ", adresse=" + adresse +
                '}';
    }
}
