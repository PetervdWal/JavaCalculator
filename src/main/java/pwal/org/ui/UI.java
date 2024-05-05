package pwal.org.ui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class UI {
    private NumPadButtonClickListener numPadButtonClickListener;
    private JLabel resultArea;

    public UI(NumPadButtonClickListener numPadButtonClickListener){
        this.numPadButtonClickListener = numPadButtonClickListener;
        resultArea = new JLabel();
        this.create();
    }

    private void create(){
        // Create the JFrame
        JFrame frame = new JFrame("Calculator");

        // Set the size of the JFrame
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0, 1));

        Container inputContainer = new Container();
        inputContainer.setLayout(new GridLayout(0,1));
        inputContainer.add(resultArea);
        frame.add(inputContainer);

        Container numPadContainer = new Container();
        numPadContainer.setLayout(new GridLayout(0,3));
        this.generateNumpadButtons().forEach(numPadContainer::add);
        frame.add(numPadContainer);


        // Make the frame visible
        frame.setVisible(true);
    }


    private  ArrayList<JButton> generateNumpadButtons(){
        ArrayList<JButton> numButtons = new ArrayList<>();
        for(int i =0; i<10; i++){
            JButton button = new JButton();
            button.setText(String.valueOf(i));
            button.setName(String.valueOf(i));


            button.addActionListener(_ -> {
                int result = numPadButtonClickListener.onButtonClick(Integer.parseInt(button.getName()));
                resultArea.setText(String.valueOf(result));
            });
            numButtons.add(button);
        }
        return numButtons;
    }
}
