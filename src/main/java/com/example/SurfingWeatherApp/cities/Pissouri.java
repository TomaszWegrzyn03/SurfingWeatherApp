package com.example.SurfingWeatherApp.cities;

import com.example.SurfingWeatherApp.entities.City;
import com.example.SurfingWeatherApp.entities.Data;

import java.util.ArrayList;
import java.util.List;

public class Pissouri extends City {

    private List<Data> data = new ArrayList<>();


    @Override
    public String getCity_name() {
        String city_name = "Pissouri";
        return city_name;
    }

    @Override
    public String getCountry_code() {
        String country_code = "CY";
        return country_code;
    }

    @Override
    public List<Data> getData() {
        return data;
    }

    @Override
    public String getLat() {
        String lat = "34.66942";
        return lat;
    }

    @Override
    public String getLon() {
        String lon = "32.70132";
        return lon;
    }

    @Override
    public void setData(List<Data> data) {
        this.data = data;
    }




}
