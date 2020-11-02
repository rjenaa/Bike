package com.globamatics.bike.repositores;

import com.globamatics.bike.models.Bike;
import org.springframework.data.repository.CrudRepository;

public interface BikeRep extends CrudRepository<Bike, Long>{
}
