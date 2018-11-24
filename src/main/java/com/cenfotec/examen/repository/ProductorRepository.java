package com.cenfotec.examen.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cenfotec.examen.domain.Productor;

public interface ProductorRepository extends MongoRepository<Productor, String> {
	public List<Productor> findBynombreLike(String name);
}
