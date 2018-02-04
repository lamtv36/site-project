package com.ntqsolution.SiteProject.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ntqsolution.SiteProject.repository.entites.User;

public interface UserRepo extends PagingAndSortingRepository<User, Integer>{

	public User findByEmail(String email);

	public boolean existsByEmail(String email);

}
