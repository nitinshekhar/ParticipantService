package com.nitin.model;

import org.springframework.data.annotation.Id;

public class Participant {

	@Id
	public String participantId;
	
	public String firstName;
	public String lastName;
	public String communicationPreference;
	
	public Participant() {}
	
	public Participant (String firstName, String lastName, String communicationPreference) {
		this.firstName = firstName;
		this.lastName =  lastName;
		this.communicationPreference = communicationPreference;
	}
	
	@Override
	public String toString() {
		return String.format("Participant [id='%s',firstName='%s', lastName='%s', communicationPreference='%s'']", participantId, firstName, lastName, communicationPreference);
	}
}
