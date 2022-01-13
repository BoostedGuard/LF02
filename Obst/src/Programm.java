public class Programm {
    public static void main(String[] args) {
        apfel apfel = new apfel();
        apfel.setGewicht(300);
        apfel.setFarbe("grün");


        obst apfel2 = new apfel();
        apfel2.setGewicht(250);
        apfel2.setFarbe("rot");

        System.out.println("Das ist ein " + apfel + " er wiegt " + apfel.getGewicht() + " und ist " + apfel.getFarbe());
        System.out.println();
        System.out.println("Das ist ein " + apfel2 + " er wiegt " + apfel2.getGewicht() + " und ist " + apfel2.getFarbe());
    }
}
