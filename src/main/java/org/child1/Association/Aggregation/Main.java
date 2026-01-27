package org.child1.Association.Aggregation;

public class Main {
    public static void main(String[] args) {
        //This is a weak HAS-A relationship, in this 2 obj have dependency on each other
        //but here, if you delete the obj of one class, the other class object, can exist
        //independently. Like if you delete teams, players can exist independently, similar
        //for schools. Here it is achieved , by having a refernce feild of that kind, but not
        //instantiating obj in there , hence the obj is a;lloted at run time, and even if the
        //parent obj having this child feilds gets deleete, the child obj alloted to that team
        //gets erased from the feild of the team , not individually gets deleted.

        Team team = new Team("Warriors");
        Player p1 = new Player("Alice");
        Player p2 = new Player("Bob");

        team.addPlayer(p1);
        team.addPlayer(p2);

        team.showPlayers();
    }
}
