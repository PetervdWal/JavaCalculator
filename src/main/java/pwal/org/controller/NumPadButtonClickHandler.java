package pwal.org.controller;

import pwal.org.ui.NumPadButtonClickListener;

public class NumPadButtonClickHandler implements NumPadButtonClickListener {

    @Override
    public void onButtonClick(int value) {
        String message = String.format("The value %s", value);
        System.out.println(message);
    }
}
