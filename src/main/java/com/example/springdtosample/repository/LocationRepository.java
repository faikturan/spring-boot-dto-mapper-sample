package com.example.springdtosample.repository;

import com.example.springdtosample.model.Location;
import org.springframework.data.repository.CrudRepository;


public interface LocationRepository extends CrudRepository<Location, Long> {
}
