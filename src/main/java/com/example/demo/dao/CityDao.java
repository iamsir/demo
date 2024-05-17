package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.City;

@Mapper
public interface CityDao {
    public City getCity(City city);

    public List<City> getCityList(Integer pageNum, Integer pageSize);
}
