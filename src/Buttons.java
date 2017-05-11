import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons implements ActionListener 
{
    private gameWindow hangman;
    private char letter;
    public Buttons (gameWindow gui, char l)
    {
    	hangman = gui;
        letter = l;
    }
    
    public void actionPerformed (ActionEvent e) 
    {
        try{
        	hangman.guessIt(letter); 
        }
        catch(Exception b){
            System.out.println(b);
        }
    }
}