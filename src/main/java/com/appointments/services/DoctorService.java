package com.appointments.services;

import com.appointments.models.Doctor;
import java.util.List;

public interface DoctorService {
    List<Doctor> getAllDoctors();

    Doctor getDoctorById(int id);

    boolean addDoctor(Doctor doctor);
}
