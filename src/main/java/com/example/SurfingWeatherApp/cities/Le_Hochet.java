package com.example.SurfingWeatherApp.cities;

import com.example.SurfingWeatherApp.entities.City;
import com.example.SurfingWeatherApp.entities.Data;

import java.util.ArrayList;
import java.util.List;

public class Le_Hochet extends City {

    private List<Data> data = new ArrayList<>();


    @Override
    public String getCity_name() {
        String city_name = "Le Hochet";
        return city_name;
    }

    @Override
    public String getCountry_code() {
        String country_code = "MU";
        return country_code;
    }

    @Override
    public List<Data> getData() {
        return data;
    }

    @Override
    public String getLat() {
        String lat = "-20.135";
        return lat;
    }

    @Override
    public String getLon() {
        String lon = "57.52111";
        return lon;
    }

    @Override
    public void setData(List<Data> data) {
        this.data = data;
    }




}
