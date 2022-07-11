package com.chainsys.mavenlessons.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.mavenlessons.entity.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor, Integer> {
	Doctor findById(int id);

	Doctor save(Doctor dr);

	// used for adding a new Doctor and 
	void deleteById(int id);

	List<Doctor> findAll();

}
