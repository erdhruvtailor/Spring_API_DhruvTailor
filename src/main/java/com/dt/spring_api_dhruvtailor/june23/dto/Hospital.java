package com.dt.spring_api_dhruvtailor.june23.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long nurseID;
	private String nurseFirstName;
	private String nurseLastName;
	private String nursePassword;
	private String nursePhoneNo;
	private Double nurseSalary;

}
