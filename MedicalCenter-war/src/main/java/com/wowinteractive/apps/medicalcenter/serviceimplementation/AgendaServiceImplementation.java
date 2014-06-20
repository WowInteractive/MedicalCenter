package com.wowinteractive.apps.medicalcenter.serviceimplementation;

import java.util.Date;
import java.util.List;

import com.wowinteractive.apps.medicalcenter.core.exceptions.ActionTimeOutException;
import com.wowinteractive.apps.medicalcenter.core.exceptions.UnavailableTimeInAgendaException;
import com.wowinteractive.apps.medicalcenter.core.model.Doctor;
import com.wowinteractive.apps.medicalcenter.core.model.agenda.Agenda;
import com.wowinteractive.apps.medicalcenter.core.model.agenda.Appointment;
import com.wowinteractive.apps.medicalcenter.core.services.AgendaService;

public class AgendaServiceImplementation implements AgendaService {

	public Agenda getAgendaByDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Appointment> getAppointmentsBetweenDates(Doctor doctor,
			Date initDate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	public Appointment getAppoinmentById(Doctor doctor, long appointmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void registerAppointmentForDoctor(Appointment appointment,
			Doctor doctor) throws UnavailableTimeInAgendaException {
		// TODO Auto-generated method stub
		
	}

	public void cancelAppointment(long appointmentId)
			throws ActionTimeOutException {
		// TODO Auto-generated method stub
		
	}

	public void postponeAppointment(long appointmentId)
			throws ActionTimeOutException {
		// TODO Auto-generated method stub
		
	}

}
