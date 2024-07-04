package com.dt.spring_api_dhruvtailor.june23.repository;

import com.dt.spring_api_dhruvtailor.june23.dto.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepo extends JpaRepository<Hospital, Long> {

    @Query("SELECT h FROM Hospital h WHERE h.nurseFirstName = ?1 ")
    public Hospital getHospitalRecordByFirstName(String name);

}
