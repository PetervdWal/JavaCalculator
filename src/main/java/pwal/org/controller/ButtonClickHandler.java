package pwal.org.controller;

import pwal.org.model.Calculator;
import pwal.org.ui.ButtonState;
import pwal.org.ui.ButtonClickListener;
import pwal.org.ui.enums.ButtonType;

public class ButtonClickHandler implements ButtonClickListener {
    private final Calculator calculator;

    public ButtonClickHandler(Calculator calculator){
        if(calculator == null){
            throw new Error("Calculator should be set");
        }
        this.calculator = calculator;
    }


    @Override
    public String onButtonClick(ButtonState button) {
        String value = button.getValue();
        ButtonType buttonType = button.getType();
        switch(buttonType){
            case NUMBER -> this.handleNumberInput(value);
            case OPERATOR -> this.handleOperatorInput(value);
        }
        return this.calculator.getDisplayText();
    }

    private void handleOperatorInput(String value) {
    }

    private void handleNumberInput(String value){
        int digit = Integer.parseInt(value);
        Double one = calculator.getNumberOne();
        Double two = calculator.getNumberTwo();
        if(one == null){
            calculator.setNumberOne(digit);
            return;
        }

        ButtonType prev = calculator.getPreviousButton().getType();
        if(two == null && prev == ButtonType.NUMBER){
            double previous = calculator.getNumberOne();
            double newVal = previous * 10 + digit;
            calculator.setNumberOne(newVal);
            return;
        }
        if(two == null){
            calculator.setNumberTwo(digit);
            return;
        }
        double previous = calculator.getNumberTwo();
        double newVal = previous * 10 + digit;
        calculator.setNumberTwo(newVal);
    }
}
