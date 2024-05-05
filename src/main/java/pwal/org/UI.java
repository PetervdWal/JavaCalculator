package pwal.org;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class UI {

    UI(){
        this.create();
    }

    private void create(){
        // Create the JFrame
        JFrame frame = new JFrame("pwal/org");

        // Set the size of the JFrame
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container container = frame.getContentPane();
        container.setLayout(new GridLayout(0,3));

        this.generateNumpadButtons().forEach(container::add);


        // Make the frame visible
        frame.setVisible(true);
    }


    private  ArrayList<JButton> generateNumpadButtons(){
        ArrayList<JButton> numButtons = new ArrayList<>();
        for(int i =0; i<10; i++){
            JButton button = new JButton();
            button.setText(String.valueOf(i));
            numButtons.add(button);
        }
        return numButtons;
    }
}
