package pwal.org.ui.enums;

public enum Operator {
    PLUS("+"),
    MINUS("-");

    private final String label;

    Operator(String label){
        this.label = label.trim();
    }

    public String getLabel(){
        return label;
    }
}