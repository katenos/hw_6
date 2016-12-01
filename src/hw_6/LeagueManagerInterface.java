/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_6;

/**
 *
 * @author admin
 */
public interface LeagueManagerInterface {
    public void addPlayer(SockerPlayer player);
    public void removePlayer(SockerPlayer player);
    public SockerPlayer getPlayer(String name);
    public SockerPlayer[] getAllPlayers();
    public SockerPlayer[] getPlayers(League league);
    public SockerPlayer[] getPlayers(Country country);
    public void addPoints(String name, int points);    
}
