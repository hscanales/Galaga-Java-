/*
 * 
 * 
 * 
 */
package GUI;

import DataBase.DAO.scoreboardDao;
import DataBase.Model.Scoreboard;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class GameOver extends JFrame {
    int score;
    String username;
    public JTable resultados;
    public JPanel table;
    DefaultTableModel tm;
    
    public static scoreboardDao dao = new scoreboardDao();
    public void registrar(){
        Scoreboard core = new Scoreboard (this.username,this.score);
        dao.create(core);
    }

    public GameOver(int score, String username) {
        super("Game Over");
        this.score = score;
        this.username = username;
        registrar();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setSize(720,480);
        this.setLocationRelativeTo(null);
        config();
        llenarTabla();
        Container container = getContentPane();
        container.add(table);
        setSize(800,800);
                
        
        
    }

    private void llenarTabla() {
        tm = new DefaultTableModel(){
            public Class<?> getColumnClass(int column){
                switch (column){
                    case 0:
                        return String.class;
                    case 1:
                        return Integer.class;
                    default:
                        return Boolean.class;
                }
            }
        };
        tm.addColumn("Nickname");
        tm.addColumn("Score");
        
        scoreboardDao sd = new scoreboardDao();
        ArrayList<Scoreboard> scores = sd.readAll();
        
        for(Scoreboard score: scores){
            tm.addRow(new Object[]{score.getNickname(),score.getScore()});
        }
        resultados.setModel(tm);
    }

    private void config() {
        resultados = new JTable();
        table = new JPanel();
        table.setBounds(10, 10 , 600, 600);
        table.add(new JScrollPane(resultados));
    }
    
    
    
    
}
