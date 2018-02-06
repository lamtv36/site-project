package com.ntqsolution.SiteProject.repository;

import com.ntqsolution.SiteProject.repository.entites.Division;
import org.springframework.data.repository.CrudRepository;;

public interface DivisionRepository extends CrudRepository<Division, Integer>{

	public boolean existsByName(String name);

}
