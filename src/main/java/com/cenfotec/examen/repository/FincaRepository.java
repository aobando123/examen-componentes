package com.cenfotec.examen.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cenfotec.examen.domain.Finca;

public interface FincaRepository extends MongoRepository<Finca, String>{
	@Query(value="{'dueno._id': ?0}")
	public List<Finca> fincaByCedula (String duenoId);
}
