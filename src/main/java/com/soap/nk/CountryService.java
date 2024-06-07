package com.soap.nk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soap.nk.entity.Country;
// import io.spring.guides.gs_producing_web_service.Country;

@Service
public class CountryService {
  private final CountryJpaRepository countryJpaRepository;

    @Autowired
    public CountryService(CountryJpaRepository countryJpaRepository) {
        this.countryJpaRepository = countryJpaRepository;
    }

    public List<Country> getAllCountries() {
        return countryJpaRepository.findAll();
    }  
}
