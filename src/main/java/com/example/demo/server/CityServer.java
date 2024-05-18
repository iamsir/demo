package com.example.demo.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CityDao;
import com.example.demo.entity.City;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CityServer {

    @Autowired
    private CityDao cityDao;

    public City getCity(City city) {
        return cityDao.getCity(city);
    }

    public PageInfo<City> getCityList(City city, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<>(cityDao.getCityList(city));
    }
    
}
