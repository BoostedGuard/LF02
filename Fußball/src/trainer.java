public class trainer {
    private String name;
    private int alter;
    private int erfahrung;

    public trainer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getErfahrung() {
        return erfahrung;
    }

    public void setErfahrung(int erfahrung) {
        this.erfahrung = erfahrung;
    }

    @Override
    public String toString(){
        String text = "Name = \t\t\t"+name;
        text += "\nAlter = \t\t"+alter;
        text += "\nErfahrung = \t"+erfahrung;
        return text;
    }
}
