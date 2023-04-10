package interview;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Team {

    List<Player> players;

    // score sum of the all players
    public int getScore(){
        if (players!=null){
            return players.stream()
                    .mapToInt(Player::getScore)
                    .reduce(0, Integer::sum);
        }else {
            return 0;
        }
    }

    // get player by skill set
    public Map<String, List<Player>> getBySkillSet(){
        Map<String, List<Player>> bySkillSet = players.stream().collect(Collectors.groupingBy(Player::getType));
        return bySkillSet;
    }


    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
