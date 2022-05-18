package dao;

import businessObjects.Adresse;
import businessObjects.Vertragspartner;
import businessObjects.Ware;

import java.sql.*;

public class WareDAO {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:KaufvertragMitDAO/src/data/Kaufvertrag.db";

    public WareDAO() throws ClassNotFoundException {
    Class.forName(CLASSNAME);
    }
    public Ware read(int warenNr) {
        Ware ware = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "SELECT * FROM ware where warenNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, warenNr);

            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();

            String bezeichnung = resultSet.getString("bezeichnung");
            String beschreibung = resultSet.getString("beschreibung");
            Double preis = resultSet.getDouble("preis");

            ware = new Ware(bezeichnung,preis);
            ware.setBezeichnung(bezeichnung);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return ware;
    }
}
