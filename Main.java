import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        Player player1 = new Player("Abhishek Sharma",24,11,570);
        player1.displayPlayerStats();
        List<String> playerList = new ArrayList<String>();
        playerList.add(player1.getName());
        playerList.clear();
        Team team1 = new Team("Indian Cricket Team","India",playerList,40,20);
        team1.addPlayer("Shubman Gill");
        team1.displayTeamPlayers();
        playerList.clear();
        playerList.add("Rizwan");
        Team team2 = new Team("Pakistan Cricket Team","Pakistan",playerList,20,40);
        team2.addPlayer("Babar");
        team2.displayTeamPlayers();
        Match match1 = new Match(1, team1.getCountryName(), team2.getCountryName(), 132, 120);
        match1.decideWinner();
        match1.displayMatchSummary();
    }
}
