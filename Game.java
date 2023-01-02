import java.util.ArrayList;

import java.util.Scanner;
/**
 * This class has all the input expected from the user , the list of words to be guessed,Guess tracker and point calculator
 *
 * @author Yonatan
 * @version CPSC 220
 */
public class Game 
{
    
    public static void main(String[] args){
        
        ArrayList<String>words=new ArrayList<String>();
        words.add("Mary");
        words.add("Washington");
        words.add("is");
        words.add("the");
        words.add("best");
        
        int j=0;
        int points=0;
        guess(j,points);
    }
    /**
     * This method keeps track of the word being guessed and the points the player is getting
     *
     * @param    j    tracks the guesses
     * @param    points        tracks points
     * @return            the number of attempts left and the points gained or lost by the player
     */

        public static void guess(int j, int points) {
        
        while ((j<=4)){
            String guess;
            Scanner input=new Scanner(System.in);
            try {
            
                
            }
            catch(Exception e) {
                e.getStackTrace();
            }
            for (int c=0;c!=5;c++){
                    int k=5-c;
                    
                    
                    System.out.println("Enter your best guess for the following questions?You have only "+ k+" attempts to guess it");

                     guess=input.nextLine();
                    
                                 
                    if (guess.equals("Mary")||guess.equals("Washington")||guess.equals("is")||guess.equals("the")||guess.equals("best")){
                        char g = guess.charAt(0);
                        close(g, 'M','W','i','t','b');
                        System.out.println( "Yay!You have guessed the right word,go get more points");
                        points=points+5;
                        System.out.println("You have gained 5 points your score is now "+points+" points");

                    }
                    else{
                        char g = guess.charAt(0);
                        close(g, 'M','W','i','t','b');
                        System.out.println("You are cold from the answer.Its okay,better luck next time.It's not too late to turn that RED to a GREEN");
                        points=points-5;
                        System.out.println("You have lost 5 points,your score now is "+points+" points");

            }
            
             int number=j++;
            int whole=number+1;
           
            Player method=new Player();
            method.Player(guess,whole); 
        }
            
                        

                
            
                        
                
            
                    

                
                

            
            
        }
    
    }
/**
     * This method prints out the color associated with how far the player is from the word to be guessed by using the inital letter of the word to be guessed
     * @param    g        first letter of the word
     * @param    M        letter M
     * @param    W        letter W
     * @param    i        letter i
     * @param    t        letter t
     * @param    b        letter b
     * @return           Print the color red if the player is far from the answer or return green if they got the answer
     */

    public static void close(char g, char M,char W,char i, char t,char b){
        
        if(g==M||g==W||g==i||g==t||g==b){
            System.out.println(Color.GREEN);
        }
        else{
            System.out.println(Color.RED );
        }
    }
}
    






