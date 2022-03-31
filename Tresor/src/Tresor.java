import java.util.ArrayList;

public class Tresor {
    private ArrayList<Gegenstand> inhalt;

    public Tresor(ArrayList<Gegenstand> gegenstaende){
        this.inhalt = gegenstaende;
    }

    public ArrayList<Gegenstand> getGegenstaende() {
        return inhalt;
    }
    public void addGegenstand (Gegenstand gegenstand){
       inhalt.add(gegenstand);
    }
    public void removeGegenstand (Gegenstand gegenstand){
        if (getGegenstaende().contains(gegenstand)){
            getGegenstaende().remove(gegenstand);
            System.out.println("Der Gegenstand mit der ID " + gegenstand.getId() + " wurde aus dem Tresor entfernt");
        }
        inhalt.remove(gegenstand);
    }

    public int getgesamtwert(){
        int gesamtwert = 0;
        for (Gegenstand i : inhalt){
            gesamtwert += i.getWert();
        }
        return gesamtwert;
    }


    @Override
    public String toString() {
        return "Im Tresor befindet sich:\n "+getGegenstaende();
    }
}


