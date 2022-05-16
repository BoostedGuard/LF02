package dao;

public class VertragspartnerDAO {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:SQL&JAVA/src/data/Kaufvertrag.db3";

    public VertragspartnerDAO() throws ClassNotFoundException {
        Class.forName(CLASSNAME);

    }
}
