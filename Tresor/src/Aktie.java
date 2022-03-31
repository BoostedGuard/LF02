public class Aktie extends Gegenstand {
        String unternehmen;
        double nennwert;
     public Aktie(int id, double wert, String unternehmen, double nennwert){
            super(id, wert);
            this.unternehmen = unternehmen;
            this.nennwert = nennwert;
        }

    public void setUnternehmen(String unternehmen) {
        this.unternehmen = unternehmen;
    }

    public String getUnternehmen() {
        return unternehmen;
    }

    public void setNennwert(double nennwert) {
        this.nennwert = nennwert;
    }

    public double getNennwert() {
        return nennwert;
    }

    @Override
    public String toString() {
         return super.toString() +
                 "\nUnternehmen: "+getUnternehmen()+
                 "\nNennwert: "+getNennwert()+
                 "\n----------------";
    }
}

