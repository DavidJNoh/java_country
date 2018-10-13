package com.David.Country.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.David.Country.models.Country;

import com.David.Country.models.Language;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
	List<Country> findAll();

	@Query("SELECT c, l FROM Country c JOIN c.languages l WHERE l.language = ?1")
	List<Object[]> Slovene(String name);
	
	@Query("SELECT c FROM Country c")
	List<Country> countCity();
	
	@Query("SELECT ci.name FROM Country c JOIN c.cities ci WHERE c.name ='Mexico' AND ci.population>500000 ORDER BY ci.population DESC")
	List<String> mexico500k();
	
	@Query("SELECT l FROM Language l WHERE l.percentage>89 ORDER BY l.percentage DESC")
	List<Language> percent89();
	
	@Query("SELECT c FROM Country c WHERE c.surface_area<501 AND c.population>100000")
	List<Country> surfacePop();
	
	@Query("SELECT c FROM Country c WHERE c.government_form='Constitutional Monarcy' AND c.surface_area>200 AND c.life_expectancy>75")
	List<Country> govFormSurfaceLifeExp();
	
	@Query("SELECT ci, c FROM Country c JOIN c.cities WHERE c.name='Argentina' AND ci.district=`Buenos Aires` AND c.population>500000")
	List<Object[]> argentinaBuenos();
	
	@Query("SELECT c FROM Country")
	List<Country> countryCountByRegion();
}
