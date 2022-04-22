package WorldDB;

import java.sql.*;

public class World
{
    public void selectToTable(Connection c) {
        try {
            String cityQuery = "SELECT * FROM city WHERE name = ?";
            PreparedStatement query = c.prepareStatement(cityQuery);
            query.setString(1, "DreamLand");
            ResultSet result = query.executeQuery();

            while (result.next()) {
                System.out.println("Name: " + result.getString("name"));
                System.out.println("Population: " + result.getString("population"));
            }

            query.close();
    } catch (SQLException e) {
    e.printStackTrace();
}
    }

    public void insertTable(Connection c)
    {
        String cityQuery = "INSERT INTO city (name, countryCode, district, population) VALUES (?, ?, ?, ?)";

        try
        {
            PreparedStatement query = c.prepareStatement(cityQuery);
            query.setString(1, "DreamLand");
            query.setString(2, "DNK");
            query.setString(3, "TheBest");
            query.setInt(4, 12345678);

            int result = query.executeUpdate();

            query.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }



    }


}
