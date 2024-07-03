package com.dt.learningtrial.pragratask.june18.task3;

import com.dt.learningtrial.pragratask.june18.task1.model.Match;
import com.dt.learningtrial.pragratask.june18.task1.repository.MatchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("task3")
public class CustomFetchData {

    @Autowired
    MatchRepo matchRepo;

    @GetMapping("getAllMatches")
    public List<Match> getAllMatches()
    {
        return matchRepo.getAllMatchList();
    }

    @GetMapping("getMatch")
    public Match getMatchById(@RequestParam("id") long matchId) {
        return matchRepo.getMatchById(matchId);
    }

}
