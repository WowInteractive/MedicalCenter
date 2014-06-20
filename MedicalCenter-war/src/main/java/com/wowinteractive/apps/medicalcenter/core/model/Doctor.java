package com.wowinteractive.apps.medicalcenter.core.model;

import java.util.List;

import com.wowinteractive.apps.medicalcenter.core.model.agenda.Agenda;

public class Doctor {
	
	private long id;
	
	private User user;
	
	private Agenda agenda;
	
	private List<Patient> patients;

}
