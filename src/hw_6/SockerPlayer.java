/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_6;

import java.util.Random;

/**
 *
 * @author admin
 */
public class SockerPlayer implements SockerPlayerInterface,Comparable{
    private String nickName;
    private int points;
    private League league;
    private Country country;
    public SockerPlayer(String nickName, League league, Country country){
        Random rand=new Random();
        this.nickName=nickName;
        this.league=league;
        this.country=country;
        this.points=rand.nextInt(100)+1;
    }

    @Override
    public String getNickName() {
       return this.nickName;
    }

    @Override
    public Integer getPoints() {
        return this.points;
    }

    @Override
    public League getLeague() {
        return this.league;
    }

    @Override
    public Country getCountry() {
        return this.country;
    }
     @Override
    public String toString() {
        return "Имя "+getNickName()+". Очки "+getPoints()+". Страна "+getCountry()+". Лига "+getLeague();
    }
    
    public void changePoints(int points) {
        this.points+=points;
    }
    
    @Override
    public int compareTo(Object obj) {
        SockerPlayer entry=(SockerPlayer)obj;
        int result=entry.getPoints().compareTo(this.getPoints());
        if(result != 0) {
            return result;
        }
        return 0;
    }
}
