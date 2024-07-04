package com.dt.spring_api_dhruvtailor;

import com.dt.spring_api_dhruvtailor.june18.task1.model.Match;
import com.dt.spring_api_dhruvtailor.june18.task1.repository.MatchRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Spring_API_DhruvTailorApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Spring_API_DhruvTailorApplication.class, args);

        MatchRepo matchRepo = applicationContext.getBean(MatchRepo.class);

        /*
        // Adding Data using the builder
        Match Match1 =Match.builder().matchId(1).name("USAVsCAD").loacation("Kitchener").build();
        Match Match2 =Match.builder().matchId(2).name("USAVsMAX").loacation("Toronto").build();
        matchRepo.addMatches(Match1);
        matchRepo.addMatches(Match2);
        */

        //Getting all data using matchRepo
        List<Match> matches = matchRepo.getAllMatchList();
        matches.forEach(System.out::println);



    }

}
