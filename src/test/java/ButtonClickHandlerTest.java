
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pwal.org.controller.ButtonClickHandler;
import pwal.org.model.Calculator;
import pwal.org.ui.ButtonState;
import pwal.org.ui.enums.ButtonType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ButtonClickHandlerTest {
    Calculator calculator;

    @BeforeEach
    void setup(){
        calculator = new Calculator();
    }

    @Test
    public void shouldBeAbleToHandleSingleDigit() {
        ButtonState buttonState = new ButtonState(ButtonType.NUMBER, "4");
        ButtonClickHandler handler = new ButtonClickHandler(calculator);
        String result = handler.onButtonClick(buttonState);

        //TODO: Fix display on full digits
        assertEquals( "4.0", result);
    }

    @Test
    public void shouldBeAbleToHandleDoubleDigits(){
        calculator.setNumberOne(2);
        ButtonState buttonState = new ButtonState(ButtonType.NUMBER, "4");
        ButtonClickHandler handler = new ButtonClickHandler(calculator);
        String result = handler.onButtonClick(buttonState);

        assertEquals("24.0", result);
    }

    @Test
    public void shouldBeAbleToHandlePrefixZero(){
        calculator.setNumberOne(0);
        ButtonState buttonState = new ButtonState(ButtonType.NUMBER, "4");
        ButtonClickHandler handler = new ButtonClickHandler(calculator);
        String result = handler.onButtonClick(buttonState);

        assertEquals( "4.0", result);
    }


}
