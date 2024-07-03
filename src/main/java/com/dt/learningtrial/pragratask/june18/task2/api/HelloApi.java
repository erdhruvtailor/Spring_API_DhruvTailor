package com.dt.learningtrial.pragratask.june18.task2.api;

import com.dt.learningtrial.pragratask.june18.task1.model.Match;
import com.dt.learningtrial.pragratask.june18.task1.repository.MatchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloApi {

    @Autowired
    MatchRepo matchRepo;

    @GetMapping("/")
    public String helloword(){
        return "HelloWord";
    }

    @GetMapping("/readme")
    public String readme(){
        return "Its return by GetMapping Annotation, which can be written like @Getmapping('readme')";
    }

    @GetMapping("location/{locationName}")
    public String pathVariableValue(@PathVariable("locationName") String name){
        return name;
    }

    @GetMapping("/allMatches")
    public List<Match> getAllMatches(){
        return matchRepo.getAllMatchList();
    }

}
