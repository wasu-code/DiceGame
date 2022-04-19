/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import java.util.Random;

/**
 *
 * @author W4SU
 */
public class PlayerComp extends Player {
    private Random r = new Random();
    
    public PlayerComp() {}
    
    public PlayerComp(String name) {
        super(name);
    }
    
    
    @Override
    public int guess() {
        return r.nextInt(6)+1;
    }
}
