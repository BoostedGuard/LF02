package dao;

public class VertragspartnerDAO {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:SQL_JAVA/src/data/Kaufvertrag.db";

    public VertragspartnerDAO() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }
}