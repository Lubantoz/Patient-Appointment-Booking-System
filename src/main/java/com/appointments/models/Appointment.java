public package com.appointments.models;

import java.time.LocalDateTime;

public class Appointment {
    private int id;
    private int patientId;
    private int doctorId;
    private LocalDateTime appointmentTime;

    public Appointment(int id, int patientId, int doctorId, LocalDateTime appointmentTime) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentTime = appointmentTime;
    }

    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getPatientId() { return patientId; }
    public void setPatientId(int patientId) { this.patientId = patientId; }

    public int getDoctorId() { return doctorId; }
    public void setDoctorId(int doctorId) { this.doctorId = doctorId; }

    public LocalDateTime getAppointmentTime() { return appointmentTime; }
    public void setAppointmentTime(LocalDateTime appointmentTime) { this.appointmentTime = appointmentTime; }
}
 Appointment {
    
}
