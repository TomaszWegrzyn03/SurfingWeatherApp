package com.example.SurfingWeatherApp.controllers;


import com.example.SurfingWeatherApp.entities.City;
import com.example.SurfingWeatherApp.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
public class MainController {

    @Autowired
    MainService mainService;


    //samo /{date}" daje ci ze trzeba wbic do localhost:port/data, to zdecydowanie za malo, musi byc cos przed np weather/{date}
    @GetMapping("/{date}")
    public City getBestCityToSurf(@PathVariable("date") String date) throws URISyntaxException, IOException, InterruptedException {
        return mainService.getBestCityToSurf(date);
    }

}
