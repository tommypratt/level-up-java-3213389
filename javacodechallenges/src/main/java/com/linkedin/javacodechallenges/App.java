package com.linkedin.javacodechallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class App {
    public static void main(String[] args) {
        Team team1 = new Team("Tom", "Gill");
        Team team2 = new Team("Jay", "Ruby");
        Team team3 = new Team("Dean", "Steph");

        List<Team> teams = List.of(team1, team2, team3);
        int numberOfRounds = 4;

        TeamUtils.generateTeamsScores(teams, numberOfRounds);
        TeamUtils.revealResults(teams);

    }

}
