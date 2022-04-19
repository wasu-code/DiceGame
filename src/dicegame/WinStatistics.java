/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import java.util.HashMap;

/**
 *
 * @author W4SU
 */
public class WinStatistics implements Statistics {
    HashMap<Player,Integer> score = new HashMap();
    
    public void andTheWinnerIs(Player p) {
        /*if (score.get(p)!=null) {
            score.put(p,score.get(p)+1);
        } else {
            score.put(p, 1);
        }*/
        Integer wins = score.getOrDefault(p, 0);
        wins+=1;
        score.put(p,wins);
    }
    
    public void print() {
        /*
        for (Player player : score.keySet()) {
            System.out.println(player);
            System.out.println(score.get(player));
        }*/
        score.forEach((player,wins) -> System.out.println(player.getName()+ ": " + score.get(player)) );
    }
    
    public void clear() {
        score.clear();
    }
    
    
    
    
}
