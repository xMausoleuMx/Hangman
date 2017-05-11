import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Insets;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class gameWindow extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField correctWordDisplay;
	private JLabel hangmanDisplay;
	private int incorrectGuesses = 0;
	private ArrayList<Character> guessedLetters = new ArrayList<Character>();
	private ArrayList<Character> guessedWord = new ArrayList<Character>();
	private ArrayList<Character> chosenWord = new ArrayList<Character>();
	JTextArea guessedLettersDisplay;
	/**
	 * Create the dialog.
	 */
	public gameWindow() {
		setBounds(100, 100, 640, 480);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnA = new JButton("A");
			btnA.setMargin(new Insets(2, 2, 2, 2));
			btnA.setBounds(10, 354, 32, 33);
			btnA.addActionListener(new Buttons (this, 'A'));
			contentPanel.add(btnA);
		}
		{
			correctWordDisplay = new JTextField();
			correctWordDisplay.setHorizontalAlignment(SwingConstants.CENTER);
			correctWordDisplay.setBounds(10, 310, 604, 33);
			correctWordDisplay.setText("");
			contentPanel.add(correctWordDisplay);
			correctWordDisplay.setColumns(10);
		}
		{
			JLabel lblGuessedLetters = new JLabel("Guessed Letters");
			lblGuessedLetters.setHorizontalAlignment(SwingConstants.CENTER);
			lblGuessedLetters.setBounds(10, 133, 89, 23);
			contentPanel.add(lblGuessedLetters);
		}
		
		JButton btnB = new JButton("B");
		btnB.setMargin(new Insets(2, 2, 2, 2));
		btnB.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnB.setBounds(52, 354, 32, 33);
		btnB.addActionListener(new Buttons (this, 'B'));
		contentPanel.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.setMargin(new Insets(2, 2, 2, 2));
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnC.setBounds(94, 354, 33, 33);
		btnC.addActionListener(new Buttons (this, 'C'));
		contentPanel.add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.setMargin(new Insets(2, 2, 2, 2));
		btnD.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnD.setBounds(137, 354, 33, 33);
		btnD.addActionListener(new Buttons (this, 'D'));
		contentPanel.add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.setMargin(new Insets(2, 2, 2, 2));
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnE.setBounds(180, 354, 33, 33);
		btnE.addActionListener(new Buttons (this, 'E'));
		contentPanel.add(btnE);
		
		JButton btnJ = new JButton("J");
		btnJ.setMargin(new Insets(2, 2, 2, 2));
		btnJ.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnJ.setBounds(395, 354, 33, 33);
		btnJ.addActionListener(new Buttons (this, 'J'));
		contentPanel.add(btnJ);
		
		JButton btnF = new JButton("F");
		btnF.setMargin(new Insets(2, 2, 2, 2));
		btnF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnF.setBounds(223, 354, 33, 33);
		btnF.addActionListener(new Buttons (this, 'F'));
		contentPanel.add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.setMargin(new Insets(2, 2, 2, 2));
		btnG.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnG.setBounds(266, 354, 33, 33);
		btnG.addActionListener(new Buttons (this, 'G'));
		contentPanel.add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.setMargin(new Insets(2, 2, 2, 2));
		btnH.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnH.setBounds(309, 354, 33, 33);
		btnH.addActionListener(new Buttons (this, 'H'));
		contentPanel.add(btnH);
		
		JButton btnI = new JButton("I");
		btnI.setMargin(new Insets(2, 2, 2, 2));
		btnI.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnI.setBounds(352, 354, 33, 33);
		btnI.addActionListener(new Buttons (this, 'I'));
		contentPanel.add(btnI);
		
		JButton btnQ = new JButton("Q");
		btnQ.setMargin(new Insets(2, 2, 2, 2));
		btnQ.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnQ.setBounds(137, 398, 33, 33);
		btnQ.addActionListener(new Buttons (this, 'Q'));
		contentPanel.add(btnQ);
		
		JButton btnM = new JButton("M");
		btnM.setMargin(new Insets(2, 2, 2, 2));
		btnM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnM.setBounds(524, 354, 33, 33);
		btnM.addActionListener(new Buttons (this, 'M'));
		contentPanel.add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.setMargin(new Insets(2, 2, 2, 2));
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnN.setBounds(567, 354, 33, 33);
		btnN.addActionListener(new Buttons (this, 'N'));
		contentPanel.add(btnN);
		
		JButton btnO = new JButton("O");
		btnO.setMargin(new Insets(2, 2, 2, 2));
		btnO.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnO.setBounds(51, 398, 33, 33);
		btnO.addActionListener(new Buttons (this, 'O'));
		contentPanel.add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.setMargin(new Insets(2, 2, 2, 2));
		btnP.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnP.setBounds(94, 398, 33, 33);
		btnP.addActionListener(new Buttons (this, 'P'));
		contentPanel.add(btnP);
		
		JButton btnV = new JButton("V");
		btnV.setMargin(new Insets(2, 2, 2, 2));
		btnV.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnV.setBounds(352, 398, 33, 33);
		btnV.addActionListener(new Buttons (this, 'V'));
		contentPanel.add(btnV);
		
		JButton btnR = new JButton("R");
		btnR.setMargin(new Insets(2, 2, 2, 2));
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnR.setBounds(180, 398, 33, 33);
		btnR.addActionListener(new Buttons (this, 'R'));
		contentPanel.add(btnR);
		
		JButton btnS = new JButton("S");
		btnS.setMargin(new Insets(2, 2, 2, 2));
		btnS.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnS.setBounds(223, 398, 33, 33);
		btnS.addActionListener(new Buttons (this, 'S'));
		contentPanel.add(btnS);
		
		JButton btnT = new JButton("T");
		btnT.setMargin(new Insets(2, 2, 2, 2));
		btnT.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnT.setBounds(266, 398, 33, 33);
		btnT.addActionListener(new Buttons (this, 'T'));
		contentPanel.add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.setMargin(new Insets(2, 2, 2, 2));
		btnU.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnU.setBounds(309, 398, 33, 33);
		btnU.addActionListener(new Buttons (this, 'U'));
		contentPanel.add(btnU);
		
		JButton btnK = new JButton("K");
		btnK.setMargin(new Insets(2, 2, 2, 2));
		btnK.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnK.setBounds(438, 354, 33, 33);
		btnK.addActionListener(new Buttons (this, 'K'));
		contentPanel.add(btnK);
		
		JButton btnX = new JButton("X");
		btnX.setMargin(new Insets(2, 2, 2, 2));
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnX.setBounds(438, 398, 33, 33);
		btnX.addActionListener(new Buttons (this, 'X'));
		contentPanel.add(btnX);
		
		JButton btnL = new JButton("L");
		btnL.setMargin(new Insets(2, 2, 2, 2));
		btnL.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnL.setBounds(481, 354, 33, 33);
		btnL.addActionListener(new Buttons (this, 'L'));
		contentPanel.add(btnL);
		
		JButton btnW = new JButton("W");
		btnW.setMargin(new Insets(2, 2, 2, 2));
		btnW.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnW.setBounds(395, 398, 33, 33);
		btnW.addActionListener(new Buttons (this, 'W'));
		contentPanel.add(btnW);
				
		JPanel hangmanPanel = new JPanel();
		hangmanPanel.setBounds(109, 11, 505, 288);
		contentPanel.add(hangmanPanel);
		
		hangmanDisplay= new JLabel("");
		hangmanPanel.add(hangmanDisplay);
		
		JButton btnY = new JButton("Y");
		btnY.setMargin(new Insets(2, 2, 2, 2));
		btnY.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnY.setBounds(481, 398, 33, 33);
		btnY.addActionListener(new Buttons (this, 'Y'));
		contentPanel.add(btnY);
		
		JButton btnZ = new JButton("Z");
		btnZ.setMargin(new Insets(2, 2, 2, 2));
		btnZ.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnZ.setBounds(524, 398, 33, 33);
		btnZ.addActionListener(new Buttons (this, 'Z'));
		contentPanel.add(btnZ);
		
		guessedLettersDisplay = new JTextArea();
		guessedLettersDisplay.setLineWrap(true);
		guessedLettersDisplay.setEditable(false);
		guessedLettersDisplay.setBounds(10, 167, 89, 72);
		contentPanel.add(guessedLettersDisplay);
		
		initializeGame();
		
	}
	
	//clear the board and pick a word
	void initializeGame(){
		incorrectGuesses = 0;
		guessedWord.clear();
		guessedLetters.clear();
		getWord();
		for(char c : chosenWord)
			guessedWord.add('_');
		updateDisplay();
	}
	
	//grabs a word from words.txt at random.
	void getWord(){
		chosenWord.clear();
		try{
			Scanner lineCounter = new Scanner(new File("words.txt"));
			int fileSize = 0;
			while(lineCounter.hasNextLine()){
				lineCounter.nextLine();
				fileSize++;
			}
			Random num = new Random();
			lineCounter.close();
			Scanner retrieveWord = new Scanner(new File("words.txt"));
			String holder="";
			int y =  num.nextInt(fileSize)+1;
			for(int i = 0; i < y;i++){
				holder = retrieveWord.nextLine();
			}
			holder = holder.toUpperCase();
			for(char c : holder.toCharArray())
				chosenWord.add(c);
			retrieveWord.close();
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "There has been an error reading the words file.");
			e.printStackTrace();
		}
	}
	
	//Guess a character and check if it is in the word
	public void guessIt(char l){
		if(alreadyGuessed(l))
			   JOptionPane.showMessageDialog(null, "That letter has already been guessed!");
		else{
			guessedLetters.add(l);
			if(checkGuess(l)){
				for(int i =0; i < chosenWord.size();i++)
					if(l == chosenWord.get(i))
						guessedWord.set(i, l);
			}
			else{
				incorrectGuesses++;
			}
			updateDisplay();
		}
	}
	
	//checks through the guessed characters to see if a given character has already been guessed.
	public boolean alreadyGuessed(char letter){
		for(int i =0; i < guessedLetters.size();i++){
			if(guessedLetters.get(i) == letter)
				return true;
		}
		return false;
	}
	
	//checks to see if guessed character is within the word
	public boolean checkGuess(char letter){
		for(int i = 0; i < chosenWord.size();i++)
			if(chosenWord.get(i)==letter)
				return true;
		
		return false;
	}
	
	//changes all displayed elements to reflect background logic
	public void updateDisplay(){
		String holder = "";
		for(int i = 0; i < guessedLetters.size();i++){
			holder+= guessedLetters.get(i);
		}
		guessedLettersDisplay.setText(holder);
		holder = "";
		for(char c : guessedWord){
			holder += ' ';
			holder += c;
			holder += ' ';
		}
		correctWordDisplay.setText(holder);
		switch(incorrectGuesses){
			case 0:
				hangmanDisplay.setIcon(new ImageIcon(gameWindow.class.getResource("/assets/gallows.png")));
				break;
			case 1:
				hangmanDisplay.setIcon(new ImageIcon(gameWindow.class.getResource("/assets/head.png")));
				break;
			case 2:
				hangmanDisplay.setIcon(new ImageIcon(gameWindow.class.getResource("/assets/body.png")));
				break;
			case 3:
				hangmanDisplay.setIcon(new ImageIcon(gameWindow.class.getResource("/assets/leftleg.png")));
				break;
			case 4:
				hangmanDisplay.setIcon(new ImageIcon(gameWindow.class.getResource("/assets/rightleg.png")));
				break;
			case 5:
				hangmanDisplay.setIcon(new ImageIcon(gameWindow.class.getResource("/assets/rightarm.png")));
				break;
			case 6:
				hangmanDisplay.setIcon(new ImageIcon(gameWindow.class.getResource("/assets/leftarm.png")));
				break;
		}
		checkIfGameOver();
	}
	
	//checks to see if either the word is guessed or the number of guesses is over the loss amount
	void checkIfGameOver(){
		boolean finishedFlag = true;
		if(incorrectGuesses >5)
			gameLose();
		for(char c : guessedWord)
			if(c=='_')
				finishedFlag = false;
		
		if(finishedFlag)
			gameWin();
	}
	
	
	void gameWin(){
		JOptionPane.showMessageDialog(null, "Congratulations!\nYou guessed the word with " + guessedLetters.size() + " guesses");
		replay();
	}
	
	void gameLose(){
		String word = "";
		for(char c: chosenWord)
			word+=c;
		JOptionPane.showMessageDialog(null, "Oh no!\nYou have been hung for not guessing the word in under 6 guesses,\n the correct answer was " + word);
		replay();
	}
	
	void replay(){
		int dialogResult = JOptionPane.showConfirmDialog (null, "Would You Like to play another game?","Play Again?",JOptionPane.YES_NO_OPTION);
		if(dialogResult == JOptionPane.YES_OPTION)
			initializeGame();
		else
			System.exit(0);
	}
	
}
