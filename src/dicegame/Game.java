/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author W4SU
 */
public class Game {
    
    private List<Player> players = new ArrayList<>();
    private Statistics stats = new NullStatistics();
    
    public Game() {}
    public Game(Statistics stats) {
        if (stats!=null) {
            this.stats = stats;
        }
    }
    
    private int dicePlayer;
    private int dicePC;
    //private int mode=2; // 1-auto, 2-użytkownik
    private Player player;
    
    public void addPlayer(Player player) {
        //this.player=player;
        
        if(nameExists(player)) {
            player.setName(player.getName()+ new Random().nextInt(10));
            addPlayer(player);
        } else {
            players.add(player);
        }
    }
    
    private boolean nameExists(Player player){
        /*check wether name of plaayer already exists on the list*/
        for (Player p : players) {
            if (player.getName().equals(p.getName())) {
                return true;
            }
        }
        return false;
    }
    
    public void play() {
        Random r = new Random();
        
        boolean repeat=true;
        do {
            dicePC = r.nextInt(6)+1;
            System.out.printf("\n--------RUNDA--------\n");
            
            for (Player player : players) {
                dicePlayer = player.guess();
                System.out.printf(player.getName() +" wylosował: " +dicePlayer +"\n");
                System.out.println("Komputer wylosowa: "+dicePC+"\n");
                if (dicePlayer==dicePC) {
                    System.out.printf("Wygrana! \n---------------------\n");
                    repeat=false;
                    stats.andTheWinnerIs(player);
                } else {
                    System.out.printf("Przegrana! \n---------------------\n");
                }
            }
        } while (repeat);
    }
    
    public void printPlayers() {
        players.forEach(player -> System.out.println(player.getName()));
    }
    
    public void removePlayer(String name) {
        /*
        for (Iterator<Player> it = players.iterator();it.hasNext();){
            if (it.next().getName().equals(name)) {
                it.remove();
                break;
            }
        }
        */
        players.removeIf(player -> player.getName().equals(name));
    }
    
    public void printStats() {
        stats.print();
    }
    
}
