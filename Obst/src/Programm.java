public class Programm {
    public static void main(String[] args) {
        apfel apfel = new apfel();
        apfel.setGewicht(300);
        apfel.setFarbe("grün");


        obst apfel2 = new apfel();
        apfel2.setGewicht(250);
        apfel2.setFarbe("rot");


        System.out.println(apfel);

    }
}
