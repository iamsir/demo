package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.City;
import com.example.demo.server.CityServer;
import com.github.pagehelper.PageInfo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Autowired
	private CityServer cityServer;

    @GetMapping("/test/{str}")
    public String index(@PathVariable(value = "str") String str) {
        System.out.println(str);     
        return "hello world:" + str;
    }

    @GetMapping("/city/{id}/{name}")
    public City getCity(@PathVariable(value = "id") Integer id, @PathVariable(value = "name") String name) {
        City city = new City();
		city.setId(id);  
        city.setName(name);  
        log.info("日志:" + city); 
        System.out.println("日志:" + city); 
        return cityServer.getCity(city);
        
    }

    @GetMapping("/cityList/{name}/{pageNum}/{pageSize}")
    public PageInfo<City> getCityList(@PathVariable(value = "name") String name, @PathVariable(value = "pageNum") Integer pageNum, @PathVariable(value = "pageSize") Integer pageSize) {
        City city = new City();
        city.setName(name); 
        return cityServer.getCityList(city, pageNum, pageSize);
        
    }

}
