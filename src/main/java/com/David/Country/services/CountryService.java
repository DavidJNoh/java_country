package com.David.Country.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.David.Country.models.Country;
import com.David.Country.models.Language;
import com.David.Country.repositories.CityRepository;
import com.David.Country.repositories.CountryRepository;
import com.David.Country.repositories.LanguageRepository;

@Service
public class CountryService {
	private final CityRepository cityRepo;
	private final CountryRepository countRepo;
	private final LanguageRepository langRepo;
	public CountryService(CityRepository get, CountryRepository baited, LanguageRepository LUL) {
		this.cityRepo = get;
		this.countRepo = baited;
		this.langRepo = LUL;
	}
	
	public void slovene(){
		String stupidShit = "Slovene";
		List<Object[]> table = countRepo.Slovene(stupidShit);
//			for(Object[] row : table) {
//			Country country = (Country) row[0];
//			Language language = (Language) row[1];
//			System.out.println(country.getName());
//		    System.out.println(language.getLanguage());
//		    System.out.println(language.getPercentage());
//		}
	}
	
	public void countCity() {
		List<Country> table = countRepo.countCity();
//		System.out.println(table);
//			for(Country country: table) {
//				System.out.println(country.getName());
//				System.out.println(country.countCities());
//			}
	}
	
	public void mexico500k() {
		List<String> cities = countRepo.mexico500k();
		for(String city: cities) {
			System.out.println(city);
		}
	}

	
}
