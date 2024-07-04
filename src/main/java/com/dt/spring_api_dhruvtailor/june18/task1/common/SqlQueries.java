package com.dt.spring_api_dhruvtailor.june18.task1.common;

public interface SqlQueries {

    String getMatchDetails = "SELECT * FROM matches";

    String addMatchQuery = "INSERT INTO matches VALUES (?,?,?)";

    String getMatchById = "SELECT * FROM matches WHERE matchId = ?";

}
