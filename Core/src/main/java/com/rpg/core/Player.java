package com.rpg.core;

/**
 *
 * @author Serveto
 */
public class Player {
    
    private String playerName;

    /**
     * Get the value of playerName
     *
     * @return the value of playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * Set the value of playerName
     *
     * @param playerName new value of playerName
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    private int money;

    /**
     * Get the value of money
     *
     * @return the value of money
     */
    public int getMoney() {
        return money;
    }

    /**
     * Set the value of money
     *
     * @param money new value of money
     */
    public void setMoney(int money) {
        this.money = money;
    }

}
