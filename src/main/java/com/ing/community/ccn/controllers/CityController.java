package com.ing.community.ccn.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/city")
public class CityController {

    @GetMapping
    @ResponseBody
    public List<String> getAllCities() throws Exception {

        List<String> cityList=new ArrayList<String>();

        String city ="Mumbai";
        String city2="Delhi";
        String city3="Brussels";
        
        cityList.add(city);
        cityList.add(city2);
        cityList.add(city3);
        return cityList;
    }

}
