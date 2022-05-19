import businessObjects.Vertragspartner;
import businessObjects.Ware;
import dao.VertragspartnerDAO;
import dao.WareDAO;

public class test {
    public static void main(String[] args) throws ClassNotFoundException {
        VertragspartnerDAO vertragspartnerDAO = new VertragspartnerDAO();
        WareDAO wareDAO = new WareDAO();

        Vertragspartner vertragspartner = vertragspartnerDAO.read("0123456789");
        System.out.println(vertragspartner.getVorname());
        System.out.println(vertragspartner.getNachname());
        System.out.println(vertragspartner.getAdresse());

        Ware ware = wareDAO.read(1);
        System.out.println(ware);
    }
}
