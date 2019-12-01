package br.com.fatecpg.apipetsearch.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatecpg.apipetsearch.models.Animal;
import br.com.fatecpg.apipetsearch.repository.AnimalRepository;

@RestController
@RequestMapping(value = "/api")

public class AnimalController {
	@Autowired
	
	AnimalRepository animalRespository;
	
	@GetMapping("/animais")
	public List<Animal> listAnimais(){
		return animalRespository.findAll();
	}
	
	@GetMapping("/animal/{id}")
	public Animal listAnimaisPorId(@PathVariable(value="id") long id){
		return animalRespository.findById(id);
	}
	
	@PostMapping("/animal")
	public Animal salvaAnimal(@RequestBody Animal animal) {
		return animalRespository.save(animal);
	}
	
	@DeleteMapping("/animal")
	public void deleteAnimal(@RequestBody Animal animal) {
		animalRespository.delete(animal);
	}
	
	@PutMapping("/animal")
	public Animal atualizaAnimal(@RequestBody Animal animal) {
		return animalRespository.save(animal);
	}
	
	
}
