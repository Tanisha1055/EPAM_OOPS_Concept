package org.child1.Association.Aggregation;

import java.util.*;

public class Team {
    private String teamName;
    private List<Player> players; // Association: Team has Players

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void showPlayers() {
        System.out.println("Team: " + teamName);
        for (Player p : players) {
            System.out.println("Player: " + p.getName());
        }
    }
}
