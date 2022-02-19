package com.nico.store.store.repository;

import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.repository.CrudRepository;

import com.nico.store.store.domain.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long>{
		
	@EntityGraph(value = "UserComplete", type=EntityGraphType.FETCH)
	User findByUsername(String username);
			
	User findByEmail(String email);

	List<User> findAllBy();

}
