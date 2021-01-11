package com.demoassign.service;
import java.time.LocalDate;
import java.util.*;

import com.demoassign.repo.BookingResponse;
import com.demoassign.repo.Event;
import com.demoassign.repo.TicketBooking;
import com.demoassign.repo.TicketCancelResponse;
import com.demoassign.repo.TicketCancelling;
public interface EventService {

	
	public List<Event> getAllEvents();
	public Event getEventById(int eId);
	public Event getEventByName(String eName);
	public Event addEvent(Event event);
	public Event updateEvent(int eId,Event event);
	public Event deleteEvent(int eId);
	public BookingResponse bookTickets(TicketBooking request);
	public TicketCancelResponse canceltickets(TicketCancelling cancel);
	public List<Event> findByEventName(String eName);

}
