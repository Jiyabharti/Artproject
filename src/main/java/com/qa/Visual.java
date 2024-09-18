package com.qa;

public class Visual extends Art {

    public boolean isColoured() {
        return coloured;
    }

    public void setColoured(boolean coloured) {
        this.coloured = coloured;
    }

    boolean coloured;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    String format;


    @Override
    public void displayInfo() {

    }

    public Visual(String creator, String title, String dateMade, String countryMade) {
        super(creator, title, dateMade, countryMade);
    }
}


