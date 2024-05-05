package pwal.org.model;

import pwal.org.ui.ButtonState;
import pwal.org.ui.enums.ButtonType;

public class Calculator {
    private Double numberOne;
    private Double numberTwo;
    private ButtonState previousButton;


    private String displayText;

    public String getDisplayText() {
        return displayText;
    }
    public ButtonState getPreviousButton() {
        return previousButton;
    }

    public void setPreviousButton(ButtonState previousButton) {
        this.previousButton = previousButton;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
        String value = String.valueOf(numberOne);
        this.displayText = value;
        this.setPreviousButton(new ButtonState(ButtonType.NUMBER, value));
    }

    public void setNumberTwo(double numberTwo){
        this.numberTwo = numberTwo;
        String value = String.valueOf(numberTwo);
        this.displayText = value;
        this.setPreviousButton(new ButtonState(ButtonType.NUMBER, value));
    }


    public Double getNumberOne() {
        return numberOne;
    }

    public Double getNumberTwo() {
        return numberTwo;
    }
}
