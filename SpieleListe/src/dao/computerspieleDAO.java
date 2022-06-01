package dao;

import Objekts.Computerspiele;

import java.net.CookieManager;
import java.sql.*;
import java.util.ArrayList;

public class computerspieleDAO {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:SpieleListe/src/data/Spiele.db";

    public computerspieleDAO() throws ClassNotFoundException{
        Class.forName(CLASSNAME);
    }

    private Computerspiele creatObject(ResultSet resultSet){
        Computerspiele computerspiele = null;
        try {
            int spielNr = resultSet.getInt("spielNr");
            String name = resultSet.getString("name");
            String genre = resultSet.getString("genre");
            int fsk = resultSet.getInt("fsk");
            double preis = resultSet.getDouble("preis");
            String releaseDate = resultSet.getString("releaseDate");
            String zustand = resultSet.getString("zustand");
            String bewertung = resultSet.getString("bewertung");
            computerspiele = new Computerspiele(name,genre,fsk,preis,releaseDate,zustand,bewertung);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return computerspiele;
    }



    public Computerspiele read(int spielNr){
        Computerspiele computerspiele = null;
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "SELECT * FROM ComputerSpiele WHERE spielNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, spielNr);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            computerspiele = creatObject(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return computerspiele;
    }
    public ArrayList read(){
        ArrayList<Computerspiele> computerspieleArrayList = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "SELCET * FROM ComputerSpiele";
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            computerspieleArrayList = new ArrayList<>();
            Computerspiele computerspiele = null;
            while (resultSet.next()){
                computerspiele = creatObject(resultSet);
                computerspieleArrayList.add(computerspiele);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return computerspieleArrayList;
    }
}
