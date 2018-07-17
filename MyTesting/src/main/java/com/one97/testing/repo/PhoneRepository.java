package com.one97.testing.repo;

import org.springframework.data.repository.CrudRepository;

import com.one97.testing.vo.Phone;

public interface PhoneRepository extends CrudRepository<Phone, Integer> {
	
}
