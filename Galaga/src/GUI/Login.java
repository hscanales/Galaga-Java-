/*
 * 
 * 
 * 
 */
package GUI;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class Login extends JFrame{
    public int WIDTH = 300, WIDTHTF = 150, WIDTHBT = 80;
    public int HEIGHT = 300, HEIGHTT = 30, HEIGHTBT = 30;
    public JTextField text;
    public JLabel fondo;
    public JButton button;
    public String user,us;
    
    
    public Login(){
        super("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setSize(720,480);
        this.setLocationRelativeTo(null);
        Load();
        Container container = getContentPane();
        container.add(button);
        container.add(fondo);
        container.add(text);
        Eventos();
    }

    public void Load() {
        fondo = new JLabel();
        fondo.setBounds(0,0,720,480);
        fondo.setIcon(new ImageIcon(getClass().getResource("")));
        text = new JTextField();
        text.setBounds(285,250,WIDTHTF,HEIGHTT);
        text.setEditable(true);
        button = new JButton("Login");
        button.setBounds(310,300,100,30);
    }

    public void Eventos() {
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                user = text.getText();
                if(user.isEmpty()){
                    JFrame frame = new JFrame();
                    JOptionPane.showMessageDialog(frame, "Ingrese un Nickname para continuar", "Error de login",
JOptionPane.INFORMATION_MESSAGE);
            }else{
                    //new Menu().setVisible(true);
                    setVisible(false);
                    JComponent comp = (JComponent) e.getSource();
                    Window win = SwingUtilities.getWindowAncestor(comp);
                    win.dispose();    
}
        
        }});
    }
    
    
    
}
