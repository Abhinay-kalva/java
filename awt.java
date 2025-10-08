import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class awt {
    awt() {
        Frame f = new Frame();
        
        // Create and set label
        Label l = new Label("Name:");
        l.setBounds(50, 50, 100, 30);

        // Create a text field
        TextField t = new TextField();
        t.setBounds(160, 50, 150, 30);

        // Create another label to display the output
        Label l2 = new Label();
        l2.setBounds(50, 150, 250, 30); // Set bounds for the label

        // Create a button
        Button b = new Button("Submit");
        b.setBounds(100, 100, 80, 30);

        // Add components to the frame
        f.add(l);
        f.add(t);
        f.add(b);
        f.add(l2);

        // Add an action listener to the button
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                String name = t.getText();
                l2.setText("You have entered: " + name);
            }
        });
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent w){
                f.dispose();
    
            }
        });

        // Set frame properties
        f.setLayout(null);
        f.setSize(400, 250);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new awt();
    }
}
