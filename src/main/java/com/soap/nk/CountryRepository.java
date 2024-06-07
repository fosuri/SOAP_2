package com.soap.nk;

import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

// import io.spring.guides.gs_producing_web_service.Country;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import jakarta.annotation.PostConstruct;
import java.util.List;
// import io.spring.guides.gs_producing_web_service.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.soap.nk.entity.Country;

@Component
public class CountryRepository {
  private final CountryService countryService;
  private List<Country> countries;

  @Autowired
  public CountryRepository(CountryService countryService) {
    this.countryService = countryService;
  }

  @PostConstruct
  public void initData() {
    countries = countryService.getAllCountries();
  }

  public Country findCountry(String name) {
    Assert.notNull(name, "The country's name must not be null");
    for (Country country : countries) {
      if (country.getName().equalsIgnoreCase(name)) {
        return country;
      }
    }
    return null;
  }
}
