package com.one97.testing.repo;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.one97.testing.vo.Person;

@Transactional
public interface PersonRepo extends CrudRepository<Person, Integer> {
	
}
