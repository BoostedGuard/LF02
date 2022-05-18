package dao;

public class WareDAO {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:SQL_JAVA/src/data/Kaufvertrag.db";

    public WareDAO() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }
    public Ware read(String warenNr) {

    }
}
