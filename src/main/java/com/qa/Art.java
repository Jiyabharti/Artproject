package com.qa;


// Superclass: Art
public class Art {
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

  private  String creator;

    private String dateMade;
    public String getDateMade() {
        return dateMade;
    }

    public void setDateMade(String dateMade) {
        this.dateMade = dateMade;
    }
    private String title;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String countryMade;
    private String painting;
    public String getCountryMade() {
        return countryMade;
    }

    public void setCountryMade(String countryMade) {
        this.countryMade = countryMade;
    }

    public String getPainting() {
        return painting;
    }

    public void setPainting(String painting) {
        this.painting = painting;
    }


    //constructors
    public Art(String creator, String title, String dateMade, String countryMade) {
        this.creator = creator;
        this.title = title;
        this.dateMade = dateMade;
        this.countryMade = countryMade;

    }}





