package pwal.org;

import pwal.org.controller.ButtonClickHandler;
import pwal.org.model.Calculator;
import pwal.org.ui.UI;

/**
 * Main class
 */
public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ButtonClickHandler handler = new ButtonClickHandler(calculator);

        UI ui = new UI(handler);

    }
}
