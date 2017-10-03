package com.theironyard.charlotte.candyjar.repositories;

import com.theironyard.charlotte.candyjar.models.Candy;
import org.springframework.data.repository.CrudRepository;

public interface CandyRepository
        extends CrudRepository<Candy, Integer> {
}
