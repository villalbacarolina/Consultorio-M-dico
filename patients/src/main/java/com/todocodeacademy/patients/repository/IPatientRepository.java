package com.todocodeacademy.patients.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.todocodeacademy.patients.model.Patient;

@Repository
public interface IPatientRepository extends JpaRepository<Patient,Long>{
}
