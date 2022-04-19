package dicegame;
import java.util.Random;

abstract public class Player { //abstrakcyjna więc nie da się utworzyć klasy Player plr = new Player() ?
    //private Random r = new Random();
    private String name="<anonimowy gracz>"; //nie zawsze dobry pomysł
    
    public Player() {/*konstruktor domyślny*/}
    
    public Player(String name) {
        setName(name);
    }
    
    public final void setName(String name) { //final - nie można NADPISAĆ z klasy podżędnej?
        if (name==null || !name.matches("^[a-zA-Z0-9.\\-_]{3,}$") ) {
            //throw new IllegalArgumentException("Podano puste imię") ; //wyjątek jest obiektem
            this.name="anonimowy_gracz";
        } else {
            this.name=name;
        }
    }
    
    public String getName() {
        return name;
    }
    
    abstract public int guess(); //
    
}
