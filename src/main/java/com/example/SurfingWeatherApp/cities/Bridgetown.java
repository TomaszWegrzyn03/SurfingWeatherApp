package com.example.SurfingWeatherApp.cities;

import com.example.SurfingWeatherApp.entities.City;
import com.example.SurfingWeatherApp.entities.Data;

import java.util.ArrayList;
import java.util.List;

public class Bridgetown extends City {

    private List<Data> data = new ArrayList<>();


    @Override
    public String getCity_name() {
        String city_name = "Bridgetown";
        return city_name;
    }

    @Override
    public String getCountry_code() {
        String country_code = "BB";
        return country_code;
    }

    @Override
    public List<Data> getData() {
        return data;
    }

    @Override
    public String getLat() {
        String lat = "13.10732";
        return lat;
    }

    @Override
    public String getLon() {
        String lon = "-59.62021";
        return lon;
    }

    @Override
    public void setData(List<Data> data) {
        this.data = data;
    }




}
