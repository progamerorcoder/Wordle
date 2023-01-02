import java.util.ArrayList;

/**
 * This class defines a Player object.
 *
 * @author Yonatan
 * @version CPSC 220
 */
public class Player 
{
    // instance variables - replace the example below with your own
    private String Wordtracker;
    private int Guesscount;
    
    private ArrayList<String>words=new ArrayList<String>();
    private ArrayList<String>userguess=new ArrayList<String>();
    
/**
     * Constructor for objects of class Player
    *

    */
   

public Player(){
    this.Wordtracker="Mary";
    this.Guesscount=0;
}
/**
     * This method prints the number of times the player attempted and the word attempted
     * 
     *
     * @param    Wordtracker   tracks the guessed word
     * @param    Guesscount     the number of times the player guessed
     */
        

public void Player(String Wordtracker,int Guesscount){
    
    System.out.println("You have guessed "+ Guesscount + " time");
    System.out.println("You have guessed the following: "+Wordtracker);
    
}
}


    
    


