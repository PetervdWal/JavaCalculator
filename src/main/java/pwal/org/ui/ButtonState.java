package pwal.org.ui;

import pwal.org.ui.enums.ButtonType;

public class ButtonState {
    private final ButtonType type;
    private final String value;


    public ButtonState(ButtonType type, String value){
        this.type = type;
        this.value = value;
    }

    public ButtonType getType(){
        return this.type;
    }

    public String getValue(){
        return this.value;
    }
}
