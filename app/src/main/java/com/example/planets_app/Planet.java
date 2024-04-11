package com.example.planets_app;

public class Planet {

    //Attributes
    private String planetName;
    private String moonCount;
    private int planetImage ;


    public Planet(String planetName, String moonCount, int planetImage) {
        this.planetName = planetName;
        this.moonCount = moonCount;
        this.planetImage = planetImage;
    }


    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    public String getMoonCount() {
        return moonCount;
    }
}
