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
