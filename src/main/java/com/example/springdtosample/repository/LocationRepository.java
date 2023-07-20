package com.example.springdtosample.repository;

import com.example.springdtosample.model.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {
}
