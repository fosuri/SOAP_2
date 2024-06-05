package com.soap.nk;

import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
  private List<Country> countries = new ArrayList<>();

  @PostConstruct
  public void initData() {
    Country russia = new Country();
    russia.setName("Russia");
    russia.setCapital("Moscow");
    russia.setCurrency(Currency.EUR);
    russia.setPopulation(46704314);

    countries.add(russia);

    Country poland = new Country();
    poland.setName("Poland");
    poland.setCapital("Warsaw");
    poland.setCurrency(Currency.PLN);
    poland.setPopulation(38186860);

    countries.add(poland);

    Country uk = new Country();
    uk.setName("United Kingdom");
    uk.setCapital("London");
    uk.setCurrency(Currency.GBP);
    uk.setPopulation(63705000);

    countries.add(uk);
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
