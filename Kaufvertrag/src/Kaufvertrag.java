public class Kaufvertrag {
    Vertragspartner verkaeufer;
    Vertragspartner kaeufer;
    Ware ware;
    String zahlungsModalitaeten;

    public Kaufvertrag(Vertragspartner verkaeufer, Vertragspartner kaeufer, Ware ware){
        this.verkaeufer = verkaeufer;
        this.kaeufer = kaeufer;
        this.ware = ware;
    }

    public Vertragspartner getVerkaeufer() {
        return verkaeufer;
    }

    public void setKaeufer(Vertragspartner kaeufer) {
        this.kaeufer = kaeufer;
    }

    public Vertragspartner getKaeufer() {
        return kaeufer;
    }

    public Ware getWare() {
        return ware;
    }

    public void setWare(Ware ware) {
        this.ware = ware;
    }

    public String getZahlungsModalitaeten() {
        return zahlungsModalitaeten;
    }

    public void setZahlungsModalitaeten(String zahlungsModalitaeten) {
        this.zahlungsModalitaeten = zahlungsModalitaeten;
    }

    @Override
    public String toString() {
        return "Kaufvertrag{" +
                "verkaeufer=" + verkaeufer +
                ", kaeufer=" + kaeufer +
                ", ware=" + ware +
                ", zahlungsModalitaeten='" + zahlungsModalitaeten + '\'' +
                '}';
    }
}
