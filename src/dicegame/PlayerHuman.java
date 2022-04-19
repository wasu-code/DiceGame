/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author W4SU
 */
public class PlayerHuman extends Player  {
    
    
    public PlayerHuman(){/*konstruktor domyślny; this("aaa") - wywołanie od razu kontruktora z parametrem*/}
    
    public PlayerHuman(String name){
        super(name); // wywołanie konstruktora kalsy nadżędnej, tu: z paramaetem name
    }
    
    @Override
    public int guess() {
        System.out.println("Podaj liczbę");
        return new Scanner(System.in).nextInt();
    }
    
}
