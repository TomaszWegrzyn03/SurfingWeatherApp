package com.example.SurfingWeatherApp.services;
import com.example.SurfingWeatherApp.cities.*;
import com.example.SurfingWeatherApp.entities.City;
import com.example.SurfingWeatherApp.entities.Data;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Service
public class MainService  {

    public List<City> getWeatherData(List<City> cities) throws URISyntaxException, IOException, InterruptedException {
        List<City> mappedCities = new ArrayList<>();
        HttpClient httpClient = HttpClient.newHttpClient();

        for(City city:cities){
            String cityName;
            if(Objects.equals(city.getCity_name(), "Le Hochet")) { cityName = "Le%20Hochet";}
            else { cityName = city.getCity_name();}

            String countryCode = city.getCountry_code();
            HttpRequest getRequest = HttpRequest.newBuilder()
                    .uri(new URI("https://api.weatherbit.io/v2.0/forecast/daily?city=" + cityName + "&country="+countryCode+"&key=ad9c3f49fa3b4a96aa1f6e58011cd299"))
                    .GET()
                    .build();

            HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(getResponse.body());
            City newCity = new ObjectMapper().readerFor(City.class).readValue(getResponse.body());
            City mappedCity = new City(newCity.getCity_name(),newCity.getCountry_code(),newCity.getData(),newCity.getLat(),newCity.getLon());
            mappedCities.add(mappedCity);
        }
        return mappedCities;
    }

    public City getBestCityToSurf(String date) throws URISyntaxException, IOException, InterruptedException {
        List<City> cities = new ArrayList<>();
        City Jastarnia = new Jastarnia();
        City Bridgetown = new Bridgetown();
        City Fortaleza = new Fortaleza();
        City Le_Hochet = new Le_Hochet();
        City Pissouri = new Pissouri();
        cities.add(Jastarnia);
        cities.add(Bridgetown);
        cities.add(Fortaleza);
        cities.add(Le_Hochet);
        cities.add(Pissouri);

        List<City> mappedCities = getWeatherData(cities);
        ArrayList<Float> highestValue = new ArrayList<>();
        for(City city:mappedCities){
            for(Data day:city.getData()) {
                if (Objects.equals(day.getDatetime(), date)) {
                    if (day.getWind_spd() >= 5 && day.getWind_spd() <= 18 && day.getTemp() >= 5 && day.getTemp() <= 35) {
                        highestValue.add((day.getWind_spd() * 3) + day.getTemp());
                    } else {
                        highestValue.add((float) 0);
                    }
                }
            }
        }

        Float maxVal = Collections.max(highestValue);
        Integer index = highestValue.indexOf(maxVal);
        City cityToReturn = mappedCities.get(index);
        if(maxVal == 0){
            return null;
        }
        else {
            return cityToReturn;
        }
    }



}
