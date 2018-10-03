/*
 * 
 * 
 * 
 */
package DataBase.DAO;
import DataBase.Connection.Conexion;
import DataBase.Interfaces.Metodos;
import DataBase.Model.Scoreboard;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.*;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class scoreboardDao implements Metodos<Scoreboard> {
    
    private static final String SQL_INSERT = "INSERT INTO Score (nickname, score) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE Scoreboard SET Score =? WHERE nickname=?";
    private static final String SQL_DELETE = "DELETE FROM Score WHERE nickname=?";
    private static final String SQL_READ = "SELECT * FROM Score WHERE nickname=?";
    private static final String SQL_READALL = "SELECT Nickname,score from Score order by score desc ";
    private static final Conexion con = Conexion.conectar();


    @Override
    public boolean create(Scoreboard g) {
        PreparedStatement ps ;
        try {
            ps = con.getCnx().prepareStatement(SQL_INSERT);
            ps.setString(1, g.getNickname());
            ps.setInt(2, g.getScore());
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(scoreboardDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion();
        }
return false;
    }

    @Override
    public ArrayList<Scoreboard> readAll() {
        ArrayList<Scoreboard> all = new ArrayList();
        Statement s;
        ResultSet rs;

        try {
            s = con.getCnx().prepareStatement(SQL_READALL);

            rs = s.executeQuery(SQL_READALL);
            //System.out.println("entro");
            while (rs.next()) {
                all.add(new Scoreboard(rs.getString(1), rs.getInt(2)));
           }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(scoreboardDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion();
        }

return all;
    }
  

}
