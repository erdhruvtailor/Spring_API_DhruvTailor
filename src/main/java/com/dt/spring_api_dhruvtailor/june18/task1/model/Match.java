package com.dt.spring_api_dhruvtailor.june18.task1.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Match {

    private long matchId;
    private String name;
    private String loacation;
}
