package com.demoassign.service;

import com.demoassign.repo.EventUser;

public interface EventUserService {
	
	public EventUser addUser(EventUser users);
	public EventUser findByUsername(String username);

}
