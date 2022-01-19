public class Programm {
    public static void main(String[] args) {
        apfel apfel = new apfel();
        apfel.setGewicht(300);
        apfel.setFarbe("grün");


        obst apfel2 = new apfel();
        apfel2.setGewicht(250);
        apfel2.setFarbe("rot");


        Banane Banane = new Banane();
        Banane.setGewicht(900);
        Banane.setFarbe("Gelb");
        Banane.setReif(true);
        Banane.setKruemmung(35);


        System.out.println(apfel);
        System.out.println();
        System.out.println(apfel2);
        System.out.println();
        System.out.println(Banane);

    }
}
