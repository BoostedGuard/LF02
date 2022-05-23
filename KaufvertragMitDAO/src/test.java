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
        Ware ware = wareDAO.read(1);
        System.out.println(ware);
    }
}
