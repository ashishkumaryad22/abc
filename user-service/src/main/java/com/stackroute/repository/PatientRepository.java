package com.stackroute.repository;
import com.stackroute.model.Patient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//@Repository

public interface PatientRepository extends MongoRepository<Patient,String> {
}
