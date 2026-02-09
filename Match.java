public class Match {
    private int matchId;
    private String team1;
    private String team2;
    private int scoreTeam1;
    private int scoreTeam2;
    private char winner;

    public Match(int matchId, String team1, String team2, int scoreTeam1, int scoreTeam2) {
        this.matchId = matchId;
        this.team1 = team1;
        this.team2 = team2;
        this.scoreTeam1 = scoreTeam1;
        this.scoreTeam2 = scoreTeam2;
    }
    public int getMatchId() {
        return matchId;
    }
    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }
    public String getTeam1() {
        return team1;
    }
    public void setTeam1(String team1) {
        this.team1 = team1;
    }
    public String getTeam2() {
        return team2;
    }
    public void setTeam2(String team2) {
        this.team2 = team2;
    }
    public int getScoreTeam1() {
        return scoreTeam1;
    }
    public void setScoreTeam1(int scoreTeam1) {
        this.scoreTeam1 = scoreTeam1;
    }
    public int getScoreTeam2() {
        return scoreTeam2;
    }
    public void setScoreTeam2(int scoreTeam2) {
        this.scoreTeam2 = scoreTeam2;
    }
    public char getWinner() {
        return winner;
    }
    public void setWinner(char winner) {
        this.winner = winner;
    }
    public void startMatch(){

    }

    public void updateScore(){

    }

    public void decideWinner(){
        if(this.getScoreTeam1() > this.getScoreTeam2()){
            this.setWinner('1');
        }else{
            this.setWinner('2');
        }
    }

    public void displayMatchSummary(){
        System.out.println(this.getMatchId());
        System.out.println(this.getTeam1()+'\n'+this.getTeam2()+'\n'+this.getScoreTeam1()+'\n'+this.getScoreTeam2()+'\n'+this.getWinner());
    }
}
