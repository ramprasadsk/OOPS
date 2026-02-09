import java.util.List;

public class Team {
    private String teamName;
    private String countryName;
    private List<String> playerList;
    private int matchesWon;
    private int matchesLost;

    
    public Team(String teamName, String countryName, List<String> playerList, int matchesWon, int matchesLost) {
        this.teamName = teamName;
        this.countryName = countryName;
        this.playerList = playerList;
        this.matchesWon = matchesWon;
        this.matchesLost = matchesLost;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public List<String> getPlayerList() {
        return playerList;
    }

    public int getMatchesWon() {
        return matchesWon;
    }
    public void setMatchesWon(int matchesWon) {
        this.matchesWon = matchesWon;
    }
    public int getMatchesLost() {
        return matchesLost;
    }
    public void setMatchesLost(int matchesLost) {
        this.matchesLost = matchesLost;
    }
    public void addPlayer(String p){
        this.playerList.add(p);
    }
    public void removePlayer(Player p){
        
    }
    public void displayTeamPlayers(){
        System.out.println('\n'+playerList.toString());
    }
}
