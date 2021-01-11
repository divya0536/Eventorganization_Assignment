package com.demoassign.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demoassign.repo.Event;

import java.time.LocalDate;
import java.util.*;
@Repository
public interface EventRepos extends JpaRepository<Event, Integer>{
	
	public List<Event> findByEventName(String eName);
	

}
