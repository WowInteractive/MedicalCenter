package com.wowinteractive.apps.medicalcenter.core.services;

import java.util.Date;
import java.util.List;

import com.wowinteractive.apps.medicalcenter.core.exceptions.ActionTimeOutException;
import com.wowinteractive.apps.medicalcenter.core.exceptions.UnavailableTimeInAgendaException;
import com.wowinteractive.apps.medicalcenter.core.model.Doctor;
import com.wowinteractive.apps.medicalcenter.core.model.agenda.Agenda;
import com.wowinteractive.apps.medicalcenter.core.model.agenda.Appointment;;

public interface AgendaService {
	
	public Agenda getAgendaByDoctor(final Doctor doctor);
	
	public List<Appointment> getAppointmentsBetweenDates(final Doctor doctor,final Date initDate,final Date endDate );
	
	public Appointment getAppoinmentById(final Doctor doctor,long appointmentId);
	
	public void registerAppointmentForDoctor(final Appointment appointment,final Doctor doctor)throws UnavailableTimeInAgendaException;
	
	public void cancelAppointment(final long appointmentId)throws ActionTimeOutException;
	
	public void postponeAppointment(final long appointmentId)throws ActionTimeOutException;
	

}
