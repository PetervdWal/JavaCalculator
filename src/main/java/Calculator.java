import javax.swing.*;

/**
 * Main class
 */
public class Calculator {

    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("My Swing App");

        // Set the size of the JFrame
        frame.setSize(400, 300);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel
        JLabel label = new JLabel("Hello, Swing!");

        // Add the label to the frame
        frame.getContentPane().add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}
