package Objekts;

public class ComputerSpiele {
    private String name;
    private String genre;
    private int fsk;
    private double preis;
    private String releaseDate;
    private String zustand;
    private String bewertung;

    public ComputerSpiele(String name, String genre, int fsk, double preis, String releaseDate, String zustand, String bewertung){
        this.name = name;
        this.genre = genre;
        this.fsk = fsk;
        this.preis = preis;
        this.releaseDate = releaseDate;
        this.zustand = zustand;
        this.bewertung = bewertung;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setFsk(int fsk) {
        this.fsk = fsk;
    }

    public int getFsk() {
        return fsk;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public double getPreis() {
        return preis;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setZustand(String zustand) {
        this.zustand = zustand;
    }

    public String getZustand() {
        return zustand;
    }

    public void setBewertung(String bewertung) {
        this.bewertung = bewertung;
    }

    public String getBewertung() {
        return bewertung;
    }

    @Override
    public String toString() {
        return "ComputerSpiele{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", fsk=" + fsk +
                ", preis=" + preis +
                ", releaseDate='" + releaseDate + '\'' +
                ", zustand='" + zustand + '\'' +
                ", bewertung='" + bewertung + '\'' +
                '}';
    }
}
