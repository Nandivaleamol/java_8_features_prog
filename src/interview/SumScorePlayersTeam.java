package interview;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
// Que.1: Find the sum of scores of all the players in a team.
// Que.2. Group the players according to their skill set (Batsmen/ Bowler).

public class SumScorePlayersTeam {
    public static void main(String[] args) {

        Player p1 = new Player("abc",60,"batman");
        Player p2 = new Player("efg",40,"batman");
        Player p3 = new Player("pqr",20,"bowler");
        Player p4 = new Player("xyz",10,"bowler");

        List<Player> players = Arrays.asList(p1,p2,p3,p4);

//        // score sum of the all players
//        int sum = players.stream().mapToInt(Player::getScore).sum();
//        System.out.println("Sum of the Score: "+sum);


        // calling getScore() method
        Team team = new Team();
        team.setPlayers(players);
        int score = team.getScore();
        System.out.println("Total Score: "+score);

        // call getBySkill method
        Map<String, List<Player>> bySkillSet = team.getBySkillSet();
        System.out.println(bySkillSet);


    }
}
