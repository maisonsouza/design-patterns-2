import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Programa {

    public static void main(String[] args) throws SQLException {

        Connection conection = new ConnectionFactory().getConnetion();
        final PreparedStatement preparedStatement = conection.prepareStatement("select * from tabela");
    }

}
