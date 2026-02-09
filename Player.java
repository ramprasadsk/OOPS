public class Player extends Person{
    private int playerId;
    private int runs;

    Player(String name, int age, int playerId, int runs) {
        super(name, age);
        this.playerId = playerId;
        this.runs = runs;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void scoreRuns(){

    }

    public void takeWicket(){

    }

    public void displayPlayerStats(){
        System.out.println(this.getName()+'\n'+this.getAge()+'\n'+this.getRuns()+'\n'+this.getPlayerId());
    }

}