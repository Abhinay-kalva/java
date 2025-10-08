import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarksCalculator extends JFrame {

    private JLabel labelSubject1, labelSubject2, labelSubject3, labelSubject4, labelSubject5;
    private JTextField textSubject1, textSubject2, textSubject3, textSubject4, textSubject5;
    private JButton buttonCalculate;
    private JLabel labelTotal, labelAverage;
    private JTextField textTotal, textAverage;

    public MarksCalculator() {
        // Frame setup
        setTitle("Marks Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Labels for subjects
        labelSubject1 = new JLabel("Subject 1:");
        labelSubject2 = new JLabel("Subject 2:");
        labelSubject3 = new JLabel("Subject 3:");
        labelSubject4 = new JLabel("Subject 4:");
        labelSubject5 = new JLabel("Subject 5:");

        // Text fields for subject marks input
        textSubject1 = new JTextField(5);
        textSubject2 = new JTextField(5);
        textSubject3 = new JTextField(5);
        textSubject4 = new JTextField(5);
        textSubject5 = new JTextField(5);

        // Button to calculate total and average
        buttonCalculate = new JButton("Calculate");

        // Labels for total and average
        labelTotal = new JLabel("Total Marks:");
        labelAverage = new JLabel("Average Marks:");

        // Text fields to display total and average
        textTotal = new JTextField(10);
        textAverage = new JTextField(10);
        textTotal.setEditable(false);
        textAverage.setEditable(false);

        // Add components to the frame
        add(labelSubject1);
        add(textSubject1);
        add(labelSubject2);
        add(textSubject2);
        add(labelSubject3);
        add(textSubject3);
        add(labelSubject4);
        add(textSubject4);
        add(labelSubject5);
        add(textSubject5);
        add(buttonCalculate);
        add(labelTotal);
        add(textTotal);
        add(labelAverage);
        add(textAverage);

        // ActionListener for the Calculate button
        buttonCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Retrieve marks from text fields
                    double marks1 = Double.parseDouble(textSubject1.getText());
                    double marks2 = Double.parseDouble(textSubject2.getText());
                    double marks3 = Double.parseDouble(textSubject3.getText());
                    double marks4 = Double.parseDouble(textSubject4.getText());
                    double marks5 = Double.parseDouble(textSubject5.getText());

                    // Calculate total and average
                    double total = marks1 + marks2 + marks3 + marks4 + marks5;
                    double average = total / 5;

                    // Display total and average
                    textTotal.setText(String.format("%.2f", total));
                    textAverage.setText(String.format("%.2f", average));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid marks", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        // Run the GUI application
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MarksCalculator().setVisible(true);
            }
        });
    }
}