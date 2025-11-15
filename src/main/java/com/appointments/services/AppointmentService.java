package com.appointments.services;

import com.appointments.models.Appointment;
import java.util.List;

public interface AppointmentService {
    List<Appointment> getAllAppointments();

    Appointment getAppointmentById(int id);

    boolean bookAppointment(Appointment appointment);
}
