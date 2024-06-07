package com.soap.nk;
import com.soap.nk.entity.Country;
// import io.spring.guides.gs_producing_web_service.Country;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryJpaRepository extends JpaRepository<Country, Long> {
  
}
