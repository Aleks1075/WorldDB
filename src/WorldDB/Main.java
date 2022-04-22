package WorldDB;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        Connection c = null;
        DBinfo d = new DBinfo();
        World w = new World();

try
{
    c = DriverManager.getConnection(d.getJdbcUrl(), d.getUsername(), d.getPassword());
    w.selectToTable(c);
    w.insertTable(c);
}catch (SQLException e) {
    e.printStackTrace();
}





        /*
        Connection connection = null;

        String JdbcUrl = "jdbc:mysql://localhost/world?" + "autoReconnect=true&useSSL=false";
        String username = "root";
        String password = "Jasamlegenda7@";

        try {
            connection = DriverManager.getConnection(JdbcUrl, username, password);

            //START YOUR STATEMENT HERE
            Statement statement = connection.createStatement();

            statement.execute("SELECT * FROM City LIMIT 10");

            ResultSet result = statement.getResultSet();
            while(result.next()) {
                System.out.println("Name: " + result.getString("name"));
                System.out.println("Population: " + result.getLong("population"));
            }

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }*/


    }
    }

