package br.com.digitalinovation.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@EnableScan
@Repository
public class HeroesRepository<Heroes> extends CrudRepositoriy<Heroes,String>{
	
}
