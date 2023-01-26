package com.example.SurfingWeatherApp.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class City {


    private String city_name;
    private String country_code;
    private List<Data> data = new ArrayList<>();
    private String lat;
    private String lon;


    public City(String city_name, String country_code, List<Data> data, String lat, String lon) {
        this.city_name = city_name;
        this.country_code = country_code;
        this.data = data;
        this.lat = lat;
        this.lon = lon;
    }

    public City() {

    }


    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public List<Data> getData() {
        return data;
    }

    @JsonSetter("data")
    public void setData(List<Data> data) {
        this.data = data;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }






}
