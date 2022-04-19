
package dicegame;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;
//regex101.com

public class DiceGame {
    
    public static void main(String[] args) {
        
        ArrayList<Player> list = new ArrayList();
        Game game = new Game(new WinStatistics()); // game + wstrzykiwanie zależności; pozwala okreslić jakie chcemu np. z klasy dziedziczącej po Statistocs
        list.add(new PlayerComp("Grazyna"));
        list.add(new PlayerComp("Jan"));
        
        
        for (Iterator<Player> it = list.iterator();it.hasNext();) {
            game.addPlayer(it.next());
            //game.play();
        }
        
        for (int i=0; i<100; ++i) {
            game.play();
        }
        
        game.printStats();
        
        
        /*
        game.printPlayers();
        game.removePlayer("Jan");
        game.printPlayers();
        */
        
        
        ///
        /*
        ArrayList<String> list = new ArrayList();   // w liście zapisujemy obiekty, jak nie zostaną na nie zamienione
                //<E> - typ elementu
        list.add("1");
        list.add("2");
        list.add("3");
        
        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
        
        for (String s : list) {
            System.out.println(s);
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        };
        
        for (Iterator<String> it = list.iterator();it.hasNext();) {
            System.out.println(it.next());
        }*/
        

        
        
        ///
        /*Random r = new Random();
        int dicePlayer;
        int dicePC;
        int mode=2; // 1-auto, 2-użytkownik*/
        /*
        Player player;
        if (mode==1) {
            player = new PlayerComp();
        } else {
            try {
                player = new PlayerHuman("");
            } catch (IllegalArgumentException ex) {
                System.err.println("/!\\Błąd. " + ex.getMessage()); //+wiadomość podana jakoparametr w throw
                player = new PlayerHuman("0"); //lub dodać ponowne wprowadzanie
            } catch (Exception ex) {
                System.out.println("Napotkano nieznany błąd");
                player = new PlayerHuman("0");
            }
        }*/
        
        
        //player.setName("You"); //set name for of your player
        
        
        /*
        do {
            dicePC = r.nextInt(6)+1;
            dicePlayer = player.guess();
            System.out.printf(player.getName() +" wylosował: " +dicePlayer +"\n");
            System.out.printf("Komputer wylosowa: "+dicePC+"\n");
            if (dicePlayer==dicePC) {
                System.out.printf("Wygrana! \n");
            } else {
                System.out.printf("Przegrana! \n---------------------\n");
            }
        } while (dicePlayer!=dicePC);*/
        
        
    }
}
