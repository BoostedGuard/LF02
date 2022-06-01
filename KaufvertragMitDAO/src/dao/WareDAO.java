package dao;

import businessObjects.Adresse;
import businessObjects.Vertragspartner;
import businessObjects.Ware;

import java.sql.*;
import java.util.ArrayList;

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
            String besonderheiten = resultSet.getString("besonderheiten");
            String maengel = resultSet.getString("maengel");
            ware = new Ware(bezeichnung, preis);
            ware.setBeschreibung(beschreibung);

            if (besonderheiten != null) {
                String[] besonderheitenArray = besonderheiten.split(";");
                for (String b : besonderheitenArray) {
                    ware.getBesonderheitenListe().add(b.trim());
                }
            }
            if (maengel != null) {
                String[] maengelArray = maengel.split(";");
                for (String m : maengelArray) {
                    ware.getMaengelListe().add(m.trim());
                }
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
        return ware;

    }

    public ArrayList read() throws SQLException {
        ArrayList<Ware> wareArrayList = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "SELECT * FROM Ware";
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            wareArrayList = new ArrayList<>();
            Ware ware = null;
            while (resultSet.next()) {
                ware = creatObjekt(resultSet);
                wareArrayList.add(ware);
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
        return wareArrayList;
    }


    private Ware creatObjekt(ResultSet resultSet) {
        Ware ware = null;
        try {
            String bezeichnung = resultSet.getString("bezeichnung");
            String beschreibung = resultSet.getString("beschreibung");
            Double preis = resultSet.getDouble("preis");
            String besonderheiten = resultSet.getString("besonderheiten");
            String maengel = resultSet.getString("maengel");
            ware = new Ware(bezeichnung, preis);
            ware.setBeschreibung(beschreibung);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ware;
    }

    public void wareDelete(int warenNr) {
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "DELETE FROM Ware WHERE warenNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, warenNr);
            preparedStatement.executeUpdate();

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

    public void wareInsertInTo(Ware ware) {
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "INSERT INTO Ware(bezeichnung, beschreibung, preis, besonderheiten, maengel)" + "VALUES (?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ware.getBezeichnung());
            preparedStatement.setString(2, ware.getBeschreibung());
            preparedStatement.setDouble(3, ware.getPreis());
            preparedStatement.setString(4, mapListToString(ware.getBesonderheitenListe()));
            preparedStatement.setString(5,mapListToString(ware.getMaengelListe()));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private String mapListToString(ArrayList<String> arrayList) {
        String semicolonSeparetedString = "";
        for (String s : arrayList) {
            if (semicolonSeparetedString.isEmpty()) {
                semicolonSeparetedString = s;
            } else {
                semicolonSeparetedString += "; " + s;
            }
        }
        return semicolonSeparetedString;
    }

    public void updateWare(String bezeichnung){
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "UPDATE Ware SET bezeichnung = ? WHERE warenNr = 4";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,bezeichnung);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

