import java.awt.event.KeyAdapter; 
import java.awt.event.KeyEvent; 
import java.awt.event.MouseAdapter; 
import java.awt.event.MouseEvent; 
import javax.swing.JFrame; 
import javax.swing.JPanel; 
 
public class Main extends JFrame
 { 
 
    public Main() { 
        setTitle("Simple Events Example"); 
        setSize(300, 200); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 
        JPanel panel = new JPanel(); 
        panel.addKeyListener(new KeyAdapter() { 
            @Override 
            public void keyPressed(KeyEvent e) { 
                System.out.println("Key pressed: " + e.getKeyChar()); 
            } 
        }); 
 
        panel.addMouseListener(new MouseAdapter() { 
            @Override 
            public void mouseClicked(MouseEvent e) { 
                System.out.println("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")"); 
            } 
        }); 
 
        panel.setFocusable(true); 
        add(panel); 
        setVisible(true); 
    } 
 
    public static void main(String[] args) { 
        new Main(); 
    } 
}