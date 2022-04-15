package cz.vsb.austra.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cz.vsb.austra.City;
import cz.vsb.austra.connector.WeatherStackConnector;
import cz.vsb.austra.dto.WeatherDto;
import cz.vsb.austra.dto.WeatherStackDto;

@Service
public class WeatherService {
	
	@RequestMapping("/weather/{city}")      
	public WeatherDto getWeatherFromCity(City cityEnum) {				
		WeatherStackConnector connector=new WeatherStackConnector();		
		WeatherStackDto weatherStackDto = connector.getWeatherForCity(cityEnum);
		return transformDto(weatherStackDto);		
	}
	private WeatherDto transformDto(WeatherStackDto weatherStackDto) {
		WeatherDto wdto = new WeatherDto();
		wdto.setLocation(weatherStackDto.getLocation().getName());
		wdto.setTimestampString(weatherStackDto.getCurrent().getObservation_time());
		wdto.setRelative_humidity(weatherStackDto.getCurrent().getHumidity());
		wdto.setTemp_celsius(weatherStackDto.getCurrent().getTemperature());
		wdto.setWeather_description(weatherStackDto.getCurrent().getWeather_descriptions().get(0).toString());
		wdto.setWind_speed_m_per_s(weatherStackDto.getCurrent().getWind_speed());		
		wdto.setWind_direction(weatherStackDto.getCurrent().getWind_dir());
		return wdto;
	}

	
}
