package com.nitin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nitin.model.Participant;
import com.nitin.repository.ParticipantRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class ParticipantServiceApplication implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(ParticipantServiceApplication.class);
	@Autowired
	private ParticipantRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ParticipantServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		repository.deleteAll();
		
		//Save a couple
		repository.save(new Participant("First1", "Last1", "EMAIL"));
		repository.save(new Participant("First2", "Last2", "EMAIL"));
		repository.save(new Participant("First3", "Last3", "SMS"));
		
		//Fetch All
		log.info("Participant Found");
		for (Participant participant : repository.findAll()) {
			log.info(participant.toString());
		}
	}
}
