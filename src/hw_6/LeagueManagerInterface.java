/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_6;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public interface LeagueManagerInterface {

    public void addPlayer(SockerPlayer player);

    public void removePlayer(SockerPlayer player);

    public SockerPlayer getPlayer(String name);

    public ArrayList<SockerPlayer> getAllPlayers();

    public ArrayList<SockerPlayer> getPlayers(League league);

    public ArrayList<SockerPlayer> getPlayers(Country country);

    public void addPoints(String name, int points);
}
