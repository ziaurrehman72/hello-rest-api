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
@RequestMapping("/list")
public class ListController {

    @GetMapping
    @ResponseBody
    public List<String> getAllCities() throws Exception {

        List<String> list=new ArrayList<String>();

        String str1 ="Hey";
        String str2="Zia";
        String str3="This side";
        
        list.add(str1);
        list.add(str2);
        list.add(str3);
        return list;
    }

}
