package cz.vsb.austra.connector;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import cz.vsb.austra.City;
import cz.vsb.austra.dto.WeatherStackDto;

public class WeatherStackConnector {
	//http://api.weatherstack.com/current?access_key=2689b4469721c8d419a2b56b2ac6bf9a&query=Prague
	private static String baseUrl="http://api.weatherstack.com/";
	private static String urlParams="current?access_key=";
	private static String apiKey="2689b4469721c8d419a2b56b2ac6bf9a";
	private static String url=baseUrl+urlParams+apiKey+"&query=";
	
	public WeatherStackDto getWeatherForCity(City cityEnum) {
		RestTemplate rTemplate=new RestTemplate();
		URI uri=null;
		try {
			uri=new URI(url+cityEnum);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		ResponseEntity<WeatherStackDto> response = rTemplate.getForEntity(uri, WeatherStackDto.class);
		return response.getBody();                //.getLocation().getName();
	}
}
