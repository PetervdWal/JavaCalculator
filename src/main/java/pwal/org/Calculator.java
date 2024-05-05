package pwal.org;

import pwal.org.controller.NumPadButtonClickHandler;
import pwal.org.ui.UI;

/**
 * Main class
 */
public class Calculator {

    public static void main(String[] args) {
        NumPadButtonClickHandler handler = new NumPadButtonClickHandler();

        UI ui = new UI(handler);

    }
}
