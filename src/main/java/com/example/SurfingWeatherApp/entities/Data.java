package com.example.SurfingWeatherApp.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

    private String datetime;
    private Float wind_spd;
    private Float temp;


    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public Float getWind_spd() {
        return wind_spd;
    }

    public void setWind_spd(Float wind_spd) {
        this.wind_spd = wind_spd;
    }

    public Float getTemp() {
        return temp;
    }

    public void setTemp(Float temp) {
        this.temp = temp;
    }



}
