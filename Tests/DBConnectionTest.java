import org.junit.jupiter.api.*;
import java.sql.*;

public class DBConnectionTest
{
    @Test
    public void connectionOpen_connectionClosed()
    {
        Connection connection = null;

        String JdbcUrl = "jdbc:mysql://localhost/world?" + "autoReconnect=true&useSSL=false";
        String username = "root";
        String password = "Jasamlegenda7@";

        try {
            connection = DriverManager.getConnection(JdbcUrl, username, password);

            Assertions.assertEquals(true, connection.isValid(1));

            connection.close();

            Assertions.assertEquals(false, connection.isValid(1));

        } catch (SQLException e) {
            e.printStackTrace();
            Assertions.assertTrue(false);
        }
    }
}
