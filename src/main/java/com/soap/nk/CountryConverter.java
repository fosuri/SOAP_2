package com.soap.nk;



import io.spring.guides.gs_producing_web_service.Country;

public class CountryConverter {

  public static Country convertToSoapCountry(com.soap.nk.entity.Country entityCountry) {
    if (entityCountry == null) {
      return null;
    }
    Country soapCountry = new Country();
    soapCountry.setName(entityCountry.getName());
    soapCountry.setCapital(entityCountry.getCapital());
    soapCountry.setPopulation(entityCountry.getPopulation());
    return soapCountry;
  }
}
