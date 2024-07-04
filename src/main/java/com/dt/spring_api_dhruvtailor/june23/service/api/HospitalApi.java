package com.dt.spring_api_dhruvtailor.june23.service.api;

import com.dt.spring_api_dhruvtailor.june23.dto.Hospital;
import com.dt.spring_api_dhruvtailor.june23.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("june23")
public class HospitalApi {

    @Autowired
    HospitalService hospitalService;

    @PostMapping("addHospitalDetail")
    public Hospital addHospitalDetail(@RequestBody Hospital hospital){
        hospitalService.addNurses(hospital);
        return hospital;
    }

    @GetMapping("getHospitalAllRecords")
    public List<Hospital> getHospitalData() {
        return hospitalService.getNurses();
    }

    @GetMapping("getHospitalRecordById")
    public Optional<Hospital> getHospitalDataById(@RequestParam("id") Long id) {
        return hospitalService.getNursesById(id);
    }

    @PutMapping("updateHospitalDetail")
    public Hospital updateHospitalDetail(@RequestBody Hospital hospital){
        hospitalService.addNurses(hospital);
        return hospital;
    }

    @DeleteMapping("deleteHospitalRecordById")
    public void deleteHospitalDataById(@RequestParam("id") Long id) {
        hospitalService.deleteRecordById(id);
    }

    @GetMapping("getHospitalRecordByName")
    public Hospital getHospitalRecordByFirstName(@RequestParam("firstName") String name) {
        return hospitalService.getHospitalRecordByFirstName(name);
    }
}
