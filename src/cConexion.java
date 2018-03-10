/**
 *
 * @author Joshua Ormachea
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class cConexion
{   
    Connection con=null; 
    Statement st;   
    String servidor="", usuarioDB, passwordDB;
    
    public cConexion()
    {   try
        {   Class.forName("com.mysql.jdbc.Driver");
            servidor = "jdbc:mysql://35.226.214.205:3306/bd_ccm?zeroDateTimeBehavior=convertToNull";
            usuarioDB="root";
            passwordDB="gunjoshuas"; 
            con= DriverManager.getConnection(servidor,usuarioDB,passwordDB); 
//            JOptionPane.showMessageDialog(null,"EXITO EN LA CONEXION");
        }
        catch(SQLException | ClassNotFoundException ex)
        {   JOptionPane.showMessageDialog(null, ex, "ERROR EN LA CONEXION CON LA BD"+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            con=null;
        }       
    }
    
    public static void main(String[]args)
    {   new cConexion();        
    }
    
    public Connection getConnection() {
        return con;
    }    
}
