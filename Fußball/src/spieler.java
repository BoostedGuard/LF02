public class spieler {
    private String name;
    private int alter;
    private int staerke;
    private int torschuss;
    private int motivation;
    private int bisherTore;

    public spieler(String name , int alter , int staerke, int torschuss , int motivation, int bisherTore){
        this.name = name;
        this.alter = alter;
        this.staerke = staerke;
        this.torschuss = torschuss;
        this.motivation = motivation;
        this.bisherTore = bisherTore;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getAlter() {
        return alter;
    }

    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    public int getStaerke() {
        return staerke;
    }

    public void setTorschuss(int torschuss) {
        this.torschuss = torschuss;
    }

    public int getTorschuss() {
        return torschuss;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    public int getMotivation() {
        return motivation;
    }

    public void setBisherTore(int bisherTore) {
        this.bisherTore = bisherTore;
    }

    public int getBisherTore() {
        return bisherTore;
    }

    @Override
    public String toString(){
        String text = "Name  \t\t= "+name;
        text += "\nAlter  \t\t= "+ alter;
        text += "\nStärke  \t= "+ staerke;
        text += "\nTorschuss\t= "+torschuss;
        text += "\nMotivation\t= "+motivation;
        text += "\nTore \t\t= "+bisherTore;
        return text;
    }
}
