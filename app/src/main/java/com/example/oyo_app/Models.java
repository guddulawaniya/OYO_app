package com.example.oyo_app;

public class Models {
    int grideimage;

    int cityimage;
    String cityname;

    public Models(String cityname) {
        this.cityname = cityname;
    }

    public Models(int cityimage, String cityname) {
        this.cityimage = cityimage;
        this.cityname = cityname;
    }

    public int getCityimage() {
        return cityimage;
    }

    public void setCityimage(int cityimage) {
        this.cityimage = cityimage;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Models(int grideimage) {
        this.grideimage = grideimage;
    }

    public int getGrideimage() {
        return grideimage;
    }

    public void setGrideimage(int grideimage) {
        this.grideimage = grideimage;
    }
}
