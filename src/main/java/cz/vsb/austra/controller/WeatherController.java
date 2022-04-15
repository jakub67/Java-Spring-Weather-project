package cz.vsb.austra.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cz.vsb.austra.City;
import cz.vsb.austra.connector.WeatherStackConnector;
import cz.vsb.austra.dto.WeatherDto;
import cz.vsb.austra.service.WeatherService;

@RestController
public class WeatherController {
	
	private WeatherService weatherService;
	public WeatherController(){
		weatherService = new WeatherService();
	}
	
	@RequestMapping("/weather")
	public Collection<WeatherDto> getWeather() {
		List<WeatherDto> weatherList = new ArrayList<>();
		//WeatherService weatherService = new WeatherService();
		for(City city: City.values()) {			
			weatherList.add(weatherService.getWeatherFromCity(city));
		}
		return weatherList;
	}

	@CrossOrigin                                                  //kvuli frontendu
	@RequestMapping("/weather/{city}")                            //promena {city}
	public WeatherDto getWeatherFromCity(@PathVariable String city) {		
		City cityEnum=City.valueOf(city.toUpperCase());
		//WeatherService weatherService = new WeatherService();
		return weatherService.getWeatherFromCity(cityEnum);	
	}
	


//	@RequestMapping("/weather")
//	public String getWeather() {
//		return "Pocasi pro vsechna mesta";
//	}
	
	
//	@RequestMapping("/weather/{city}")      //promena {city}
//	public String getWeatherFromCity(@PathVariable String city) {		
//		City cityEnum=City.valueOf(city.toUpperCase());
//		WeatherStackConnector connector=new WeatherStackConnector();
//		return connector.getWeatherForCity(cityEnum);
//	}
}
