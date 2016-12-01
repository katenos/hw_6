/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_6;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author admin
 */
public class LeagueManager implements LeagueManagerInterface {

    private TreeSet<SockerPlayer> players = new TreeSet<SockerPlayer>();

    @Override
    public void addPlayer(SockerPlayer player) {
        players.add(player);
    }

    @Override
    public void removePlayer(SockerPlayer player) {
        if (players.contains(player)) {
            players.remove(player);
        } else {
            System.out.println("Не удалось удалить игрока.");
        }
    }

    @Override
    public SockerPlayer getPlayer(String name) {        
        for (SockerPlayer player : players) {
            if (player.getNickName().equals(name)) {
                return player;
            }
        }
        return null;
    }

    @Override
    public SockerPlayer[] getAllPlayers() {
        return players.toArray(new SockerPlayer[players.size()]);
    }

    @Override
    public SockerPlayer[] getPlayers(League league) {
        ArrayList<SockerPlayer> arrayOfLeague = new ArrayList<>();
        for (SockerPlayer player : players) {
            if (player.getLeague().equals(league)) {
                arrayOfLeague.add(player);
            }
        }     
        return arrayOfLeague.toArray(new SockerPlayer[arrayOfLeague.size()]);
    }

    @Override
    public SockerPlayer[] getPlayers(Country country) {
        ArrayList<SockerPlayer> arrayOfCountry = new ArrayList<>();
        for (SockerPlayer player : players) {
            if (player.getCountry().equals(country)) {
                arrayOfCountry.add(player);
            }
        }
        return arrayOfCountry.toArray(new SockerPlayer[arrayOfCountry.size()]);
    }

    @Override
    public void addPoints(String name, int points) {
        for (SockerPlayer player : players) {
            if(player.getNickName().equals(name)){
                player.changePoints(points);
            }
        }
    }


}
