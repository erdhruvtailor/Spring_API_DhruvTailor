package com.dt.spring_api_dhruvtailor.june23.service;

import com.dt.spring_api_dhruvtailor.june23.dto.Hospital;
import com.dt.spring_api_dhruvtailor.june23.repository.HospitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalService {

    @Autowired
    HospitalRepo hospitalRepo;

    public Hospital addNurses(Hospital hospital){
        hospitalRepo.save(hospital);
        return hospital;
    }

    public List<Hospital> getNurses() {
        return hospitalRepo.findAll();
    }

    public Optional<Hospital> getNursesById(long id) {
        return hospitalRepo.findById(id);
    }

    public void deleteRecordById(long id) {
        hospitalRepo.deleteById(id);
    }

    public Hospital getHospitalRecordByFirstName(String name) {
        return hospitalRepo.getHospitalRecordByFirstName(name);
    }

}
