package br.com.fatecpg.apipetsearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatecpg.apipetsearch.models.Animal;

public interface AnimalRepository extends JpaRepository <Animal, Long>{
	
	Animal findById(long id);
}

