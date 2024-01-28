package com.example.testpi;

public class Player {
    private String playerName , playerPosition , playerAge , playerClub , playerNumber , playerRating , playerDominantFoot ;

    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public String getPlayerAge() {
        return playerAge;
    }

    public String getPlayerClub() {
        return playerClub;
    }

    public String getPlayerNumber() {
        return playerNumber;
    }

    public String getPlayerRating() {
        return playerRating;
    }

    public String getPlayerDominantFoot() {
        return playerDominantFoot;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Player(String playerName, String playerPosition, String playerAge, String playerClub, String playerNumber, String playerRating, String playerDominantFoot) {
        this.playerName = playerName;
        this.playerPosition = playerPosition;
        this.playerAge = playerAge;
        this.playerClub = playerClub;
        this.playerNumber = playerNumber;
        this.playerRating = playerRating;
        this.playerDominantFoot = playerDominantFoot;
    }
}
