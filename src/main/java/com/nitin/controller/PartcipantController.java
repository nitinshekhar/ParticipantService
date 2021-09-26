package com.nitin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.nitin.model.Participant;
import com.nitin.repository.ParticipantRepository;

@RestController
@RequestMapping (value="/participant")

public class PartcipantController {
	
	@Autowired
	private ParticipantRepository partcipantRepository;
	
	@GetMapping(value="/{particiapntId}")
	public ResponseEntity<Participant> getReminder(@PathVariable("particiapntId") String id) {
		try {
			Participant participant = partcipantRepository.findByPartcipantId(id);
			return new ResponseEntity<Participant>(participant, HttpStatus.OK);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ID NOT FOUND", e);
		}
	}	
	

}
