package com.nitin.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nitin.model.Participant;

public interface ParticipantRepository extends MongoRepository<Participant, String>{
	public Participant findByFirstName(String firstName);
	public List<Participant> findByLastName(String lastName);
	public Participant findByPartcipantId(String particiapntId);
}
