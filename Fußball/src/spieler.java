public class spieler {
    private String name;
    private int alter;
    private int staerke;
    private int torschuss;
    private int motivation;
    private int bisherTore;

    public spieler(String name){
        this.name = name;
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
        String text = "Name = \t\t\t\t"+name;
        text += "\nAlter = \t\t\t"+ alter;
        text += "\nStärke = \t\t\t"+ staerke;
        text += "\nTorschuss = \t\t"+torschuss;
        text += "\nMotivation = \t\t"+motivation;
        text += "\nBisherige Tore = \t"+bisherTore;
        return text;
    }
}
