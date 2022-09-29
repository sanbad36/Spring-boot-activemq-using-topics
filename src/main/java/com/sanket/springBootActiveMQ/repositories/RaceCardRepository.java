package com.sanket.springBootActiveMQ.repositories;

import com.sanket.springBootActiveMQ.entites.RaceCardEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceCardRepository extends CrudRepository<RaceCardEntity, Long> {
}
