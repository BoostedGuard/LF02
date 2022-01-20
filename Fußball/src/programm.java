public class programm {
    public static void main(String[] args) {
        trainer trainer = new trainer("Günni" , 45 , 8);

        spieler spieler = new spieler("Harry" ,23,8, 7,6,26 );

        torwart torwart = new torwart("Dieter",35,7,9,8);


        System.out.println(trainer);
        System.out.println();
        System.out.println(spieler);
        System.out.println();
        System.out.println(torwart);
    }
}
