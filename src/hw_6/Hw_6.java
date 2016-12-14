/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_6;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author admin
 */
public class Hw_6 {

    /**
     * @param args the command line arguments
     */
    private static League league;
    private static Country country;
    private static Random rand = new Random();
    private static LeagueManager leaguesM = new LeagueManager();

    public static void main(String[] args) {
        createPlayers();
        printData();
    }

    private static void printData() {
        System.out.println("Вывод всех игроков");
        ArrayList<SockerPlayer> playersAll = leaguesM.getAllPlayers();
        for (int i = 0; i < playersAll.size(); i++) {
            System.out.println(playersAll.get(i).toString());
        }
        printPlayerOfCountries();
        printPlayerOfLeagues();
    }

    private static void printPlayerOfLeagues() {
        System.out.println("Игроки из высшей лиги: ");
        printPlayers(leaguesM.getPlayers(League.MAJOR));
        System.out.println("Игроки из певрой лиги: ");
        printPlayers(leaguesM.getPlayers(League.FIRST));
        System.out.println("Игроки из премьер лиги: ");
        printPlayers(leaguesM.getPlayers(League.PRIME));
        System.out.println("Игроки из второй лиги: ");
        printPlayers(leaguesM.getPlayers(League.SECOND));
    }

    private static void printPlayers(ArrayList<SockerPlayer> players) {
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i).toString());
        }
        System.out.println("");
    }

    private static void printPlayerOfCountries() {
        System.out.println("Игроки из Латвии: ");
        printPlayers(leaguesM.getPlayers(Country.LATVIA));
        System.out.println("Игроки из России: ");
        printPlayers(leaguesM.getPlayers(Country.RUSSIA));
        System.out.println("Игроки из Словении: ");
        printPlayers(leaguesM.getPlayers(Country.SLOVENIA));
        System.out.println("Игроки из Великобритании: ");
        printPlayers(leaguesM.getPlayers(Country.UNITED_KINGDOM));
        System.out.println("Игроки из США: ");
        printPlayers(leaguesM.getPlayers(Country.USA));
    }

    private static void createPlayers() {
        int countPlayer = 20;
        String name = "Игрок №";
        for (int i = 0; i < countPlayer; i++) {
            generateRandomData();
            leaguesM.addPlayer(new SockerPlayer(name + rand.nextInt(100), league, country));
        }
    }

    private static void generateRandomData() {
        switch (rand.nextInt(League.values().length)) {
            case 0:
                league = League.FIRST;
                break;
            case 1:
                league = League.MAJOR;
                break;
            case 2:
                league = League.PRIME;
                break;
            case 3:
                league = League.SECOND;
                break;
        }

        switch (rand.nextInt(Country.values().length)) {
            case 0:
                country = Country.LATVIA;
                break;
            case 1:
                country = Country.RUSSIA;
                break;
            case 2:
                country = Country.SLOVENIA;
                break;
            case 3:
                country = Country.UNITED_KINGDOM;
                break;
            case 4:
                country = Country.USA;
                break;
        }
    }

}
