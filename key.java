import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class key extends JFrame implements KeyListener {
    private JLabel statusLabel;

    public key() {
        setTitle("Key Event Demo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        statusLabel = new JLabel("Press any key!", JLabel.CENTER);
        statusLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        add(statusLabel, BorderLayout.CENTER);

        // Add KeyListener to the frame
        addKeyListener(this);

        // Set focusable to capture key events
        setFocusable(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        statusLabel.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        statusLabel.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyTyped(KeyEvent e) {
        statusLabel.setText("Key Typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        key demo = new key();
            demo.setVisible(true);
        });
    }
}
