package dao;

import businessObjects.Adresse;
import businessObjects.Vertragspartner;

import javax.security.auth.kerberos.KerberosTicket;
import java.net.ConnectException;
import java.sql.*;
import java.util.ArrayList;

public class VertragspartnerDAO {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:KaufvertragMitDAO/src/data/Kaufvertrag.db";

    public VertragspartnerDAO() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }

    /**
     * liest einen vertragspartner auf basis seiner ausweisnumer
     *
     * @param ausweisNr die ausweisNr
     * @return der gewünschte vertragspartner
     */

    public Vertragspartner read(String ausweisNr) {
        Vertragspartner vertragspartner = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        //  Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);


            //SQL Abfrage erstellen
            String sql = "SELECT * FROM vertragspartner where ausweisNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ausweisNr);


            //SQL abfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();

            //zeiger auf den ersten datensatz setzen
            resultSet.next();
            vertragspartner = createObject(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return vertragspartner;
    }

    public ArrayList read() {
        ArrayList<Vertragspartner> vertragspartnerliste = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        //Verbindung zu Datenbank herstellen

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "SELECT * FROM Vertragspartner";
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            vertragspartnerliste = new ArrayList<>();
            Vertragspartner vertragspartner = null;
            while (resultSet.next()) {
                vertragspartner = createObject(resultSet);
                vertragspartnerliste.add(vertragspartner);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return vertragspartnerliste;
    }

    private Vertragspartner createObject(ResultSet resultSet) {
        Vertragspartner vertragspartner = null;
        try {
            String nr = resultSet.getString("AusweisNR");
            String vorname = resultSet.getString("Vorname");
            String nachname = resultSet.getString("Nachname");
            String strasse = resultSet.getString("Strasse");
            String hausNr = resultSet.getString("HausNr");
            String plz = resultSet.getString("plz");
            String ort = resultSet.getString("Ort");
            // Vertragspartner erstellen
            vertragspartner = new Vertragspartner(vorname, nachname);
            vertragspartner.setAusweisNr(nr);
            Adresse adresse = new Adresse(strasse, hausNr, plz, ort);
            vertragspartner.setAdresse(adresse);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vertragspartner;
    }

    public void vertragspartnerDelete(String ausweisNr) {
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "DELETE FROM vertragspartner WHERE ausweisNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ausweisNr);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void insertInTo(String ausweisNr, String vorname, String nachname, String strasse, String hausNr, String plz, String ort) {
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "INSERT INTO Vertragspartner VALUES (?,?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ausweisNr);
            preparedStatement.setString(2, vorname);
            preparedStatement.setString(3, nachname);
            preparedStatement.setString(4, strasse);
            preparedStatement.setString(5, hausNr);
            preparedStatement.setString(6, plz);
            preparedStatement.setString(7, ort);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void updateVertragspartner(String vorname){
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        try {
            connection=DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "UPDATE Vertragspartner SET vorname = ? WHERE ausweisNr = 0123456789";
            preparedStatement.setString(1,vorname);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}


