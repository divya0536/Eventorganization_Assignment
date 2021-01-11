package com.demoassign.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demoassign.repo.EventUser;
@Repository
public interface EventUserRepo extends JpaRepository<EventUser, Integer>{

	public EventUser findByUsername(String username);
}
