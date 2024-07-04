package com.dt.spring_api_dhruvtailor.june18.task1.repository;

import com.dt.spring_api_dhruvtailor.june18.task1.common.SqlQueries;
import com.dt.spring_api_dhruvtailor.june18.task1.model.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class MatchRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Match> getAllMatchList() {

        RowMapper<Match> matchRowMapper = new RowMapper<Match>() {
            @Override
            public Match mapRow(ResultSet rs, int rowNum) throws SQLException {
                Match match = new Match();
                match.setMatchId(rs.getInt("MATCHID"));
                match.setName(rs.getString("NAME"));
                match.setLoacation(rs.getString("LOCATION"));
                return match;
            }
        };

        List<Match> matches = jdbcTemplate.query(SqlQueries.getMatchDetails, matchRowMapper);

        return matches;
    }

    public void addMatches(Match match){
        jdbcTemplate.update(SqlQueries.addMatchQuery, match.getMatchId(), match.getName(), match.getLoacation());
    }

    public Match getMatchById(Long id){

        RowMapper<Match> matchRowMapper2 = new RowMapper<Match>() {
            @Override
            public Match mapRow(ResultSet rs, int rowNum) throws SQLException {
                Match match = new Match();
                match.setMatchId(rs.getInt("MATCHID"));
                match.setName(rs.getString("NAME"));
                match.setLoacation(rs.getString("LOCATION"));
                return match;
            }
        };

        return jdbcTemplate.queryForObject(SqlQueries.getMatchById, new Object[]{id}, matchRowMapper2);
    }

}
