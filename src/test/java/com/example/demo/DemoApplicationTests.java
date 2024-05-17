package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.City;
import com.example.demo.server.CityServer;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private CityServer cityServer;

	//@Autowired
	//private CityDao cityDao;

	@Test
	public void getCityTest() throws Exception {

		City city = new City();
		city.setId(100);
		System.out.println("fg非人非");
		System.out.println("123" + cityServer.getCity(city).toString());
		

	}

	@Test
	public void getCityListTest() throws Exception {

		System.out.println("" + cityServer.getCityList(2, 10));
		

	}

}
