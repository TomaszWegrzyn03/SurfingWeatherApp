package com.example.SurfingWeatherApp.cities;

import com.example.SurfingWeatherApp.entities.City;
import com.example.SurfingWeatherApp.entities.Data;

import java.util.ArrayList;
import java.util.List;

//klasy mozna bylo zrobic jako enum z polami
public class Bridgetown extends City {

    private List<Data> data = new ArrayList<>();


    @Override
    public String getCity_name() {
        String city_name = "Bridgetown";
        return city_name;
    }

    @Override
    public String getCountry_code() {
        //bezsensownie jest inicjalizowac zmienna zeby pozniej ja zwracac
        String country_code = "BB";
        return country_code;
    }

    @Override
    public List<Data> getData() {
        return data;
    }

    @Override
    public String getLat() {
        //bezsensownie jest inicjalizowac zmienna zeby pozniej ja zwracac, zrob od razu return "13.10732";
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
//za duzo enterow po ostatniej metodzie, dbaj o formatowanie



}
