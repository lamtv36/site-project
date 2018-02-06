package com.ntqsolution.SiteProject.repository;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ntqsolution.SiteProject.repository.entites.User;

public interface UserRepository extends PagingAndSortingRepository<User, Integer>{

	public User findById(String id);
	
	public User findByEmail(String email);

	public boolean existsByEmail(String email);
	
	public List<User> findAll();
	
	public void deleteById(String id);

	public User save(User user);
	
}
