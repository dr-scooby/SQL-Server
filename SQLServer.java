
package sqlserver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;

/**
 *
 * @author Jahangir Ismail
 */
public class SQLServer {
    
    
    public SQLServer(){
        String connectionUrl =
                "jdbc:sqlserver://localhost:1433;"
                        + "database=AdventureWorks2019;"
                        + "user=scooby;"
                        + "password=123;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";

        try {       
            Connection conn = DriverManager.getConnection(connectionUrl);
        
            // Code here.
            if (conn != null) {
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new SQLServer();
    }
    
}
