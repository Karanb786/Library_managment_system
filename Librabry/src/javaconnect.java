import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class javaconnect {
    
    Connection conn=null;
    
    public static Connection ConnecDB()
    {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/lib","postgres","1234");
         
            
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}