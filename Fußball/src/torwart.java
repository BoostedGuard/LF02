public class torwart extends spieler{
    private int reaktion;

    public torwart(String name, int alter , int staerke, int motivation , int reaktion ){
        super(name, alter,staerke,0,motivation,0);
        this.reaktion = reaktion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nreaktion \t= " + reaktion;
    }

    public void setReaktion(int reaktion) {
        this.reaktion = reaktion;
    }

    public int getReaktion() {
        return reaktion;
    }
}
