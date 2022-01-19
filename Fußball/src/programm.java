public class programm {
    public static void main(String[] args) {
        trainer trainer = new trainer("Günni");
        trainer.setAlter(45);
        trainer.setErfahrung(8);

        spieler spieler = new spieler("Harry");
        spieler.setAlter(23);
        spieler.setStaerke(80);
        spieler.setTorschuss(90);
        spieler.setMotivation(70);
        spieler.setBisherTore(15);

        System.out.println(trainer);
        System.out.println();
        System.out.println(spieler);

    }
}
