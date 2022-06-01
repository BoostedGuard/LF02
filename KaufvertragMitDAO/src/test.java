import businessObjects.Vertragspartner;
import businessObjects.Ware;
import dao.VertragspartnerDAO;
import dao.WareDAO;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws ClassNotFoundException {

        VertragspartnerDAO vertragspartnerDAO = new VertragspartnerDAO();
        ArrayList<Vertragspartner> vertragspartnerArrayList = new VertragspartnerDAO().read();
        for (Vertragspartner v : vertragspartnerArrayList){
            System.out.println(v);
        }
        WareDAO wareDAO = new WareDAO();

        //Ware wareNeu = new Ware("Handy",99);
        //wareNeu.setBeschreibung("Funktioniert");
        //wareNeu.getBesonderheitenListe().add("Mit hülle");
        //wareNeu.getMaengelListe().add("Akku etwas schwach");
        //wareDAO.wareInsertInTo(wareNeu);

        wareDAO.updateWare("handy");

        Ware ware = wareDAO.read(4);
        System.out.println(ware);

    }
}
