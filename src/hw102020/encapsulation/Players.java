package HW102020.encapsulation;

public class Players {

    private String playerName;
    private String playerPosition;
    private int playerNumber;


                    // setter method
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }


                    // getter method
    public String getPlayerName(){
        return playerName;
    }

    public String getPlayerPosition(){
        return playerPosition;
    }

    public int getPlayerNumber(){
        return playerNumber;
    }
}

