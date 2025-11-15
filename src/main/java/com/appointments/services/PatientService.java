package com.appointments.services;

import com.appointments.models.Patient;
import java.util.List;

public interface PatientService {
    List<Patient> getAllPatients();

    Patient getPatientById(int id);

    boolean addPatient(Patient patient);
}
