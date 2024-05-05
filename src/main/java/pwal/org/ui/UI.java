package pwal.org.ui;

import pwal.org.ui.enums.ButtonType;
import pwal.org.ui.enums.Operator;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class UI {
    private final ButtonClickListener numPadButtonClickListener;
    private final JLabel resultArea;
    private ButtonState previousButton;

    public UI(ButtonClickListener numPadButtonClickListener){
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

        Container operatorContainer = new Container();
        operatorContainer.setLayout(new GridLayout(0,2));
        this.generateOperatorButtons().forEach(operatorContainer::add);
        frame.add(operatorContainer);


        // Make the frame visible
        frame.setVisible(true);
    }


    private  ArrayList<JButton> generateNumpadButtons(){
        ArrayList<JButton> numButtons = new ArrayList<>();
        for(int i =0; i<10; i++){
            JButton button = this.createButton(String.valueOf(i));
            button.addActionListener(_ -> {
                String buttonName = button.getName();
                String result =  numPadButtonClickListener.onButtonClick(new ButtonState(ButtonType.NUMBER, buttonName));
                resultArea.setText(String.valueOf(result));
            });
            numButtons.add(button);
        }
        return numButtons;
    }

    private ArrayList<JButton> generateOperatorButtons(){
        ArrayList<JButton> numButtons = new ArrayList<>();
        for(Operator operator: Operator.values()){
            JButton button = createButton(operator.getLabel());
            button.addActionListener(_ -> {
                        String buttonName = button.getName();
                        numPadButtonClickListener.onButtonClick(new ButtonState(ButtonType.OPERATOR, buttonName));
                    });
            numButtons.add(button);
        }
        return numButtons;
    }

    private JButton createButton(String value){
        JButton button = new JButton();
        button.setText(String.valueOf(value));
        button.setName(String.valueOf(value));
        return button;
    }
}
