package worldcup;

import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * @author AdministradorCIFO
 */
public class Game {

    //DONE: to uncomment when class Field is created
    Field field;

    int size;
    ArrayList<Team> teams = new ArrayList<Team>();

    public static void main(String[] args) {
        int variableMethod;
        
        System.out.println("starting application");

        // Create Referee
        Referee referee = new Referee();

        // create players team A
        Goalkeeper goalkeeperA = new Goalkeeper();
        Defender defender1 = new Defender();
        Defender defender2 = new Defender();
        Defender defender3 = new Defender();
        Defender defender4 = new Defender();
        Defender defender5 = new Defender();

        //TODO create 4 defender players for teamA     
        Defender defender1A = new Defender();
        Defender defender2A = new Defender();
        Defender defender3A = new Defender();
        Defender defender4A = new Defender();
        
        //TODO create midfielder players for teamA
        Midfielder midfielderA = new Midfielder();
        
        //TODO 2 forward players for teamA
        Forward forward1A = new Forward();
        Forward forward2A = new Forward();
        
        //TODO create coach team A
        Coach coachA = new Coach();
        
        // create players team B
        Goalkeeper goalkeeperB = new Goalkeeper();
        
        //TODO create 4 defender players for teamB   
        Defender defender1B = new Defender();
        Defender defender2B = new Defender();
        Defender defender3B = new Defender();
        Defender defender4B = new Defender();
        
        //TODO create midfielder players for teamB
        Midfielder midfielderB = new Midfielder();
        
        //TODO 2 forward players for teamB
        Forward forward1B = new Forward();
        Forward forward2B = new Forward();
        
        //TODO create coach team B
        Coach coachB = new Coach();
        
        //TODO create teams
        Team teamA = new Team();      
        Team teamB = new Team();   
        
        //TODO add players to teams
        teamA.players.add(goalkeeperA);
        teamA.players.add(defender1A);
        teamA.players.add(defender2A);
        teamA.players.add(defender3A);
        teamA.players.add(defender4A);
        teamA.players.add(midfielderA);
        teamA.players.add(forward1A);
        teamA.players.add(forward2A);
        
        teamB.players.add(goalkeeperB);
        teamB.players.add(defender1B);
        teamB.players.add(defender2B);
        teamB.players.add(defender3B);
        teamB.players.add(defender4B);
        teamB.players.add(midfielderB);
        teamB.players.add(forward1B);
        teamB.players.add(forward2B);

        //TODO add teams to match
        Game game1 = new Game();
        game1.teams.add(teamA);
        game1.teams.add(teamB);
        
        // start game
        game1.start();
        
        // half time game
        game1.half_time_game();
        
        // end game
        game1.end_game();
    }

    public void start() {
        System.out.println("starting");
    }
    public void half_time_game() {
        System.out.println("half time game");
    }
    public void end_game() {
        System.out.println("end game");
    }
    
}
