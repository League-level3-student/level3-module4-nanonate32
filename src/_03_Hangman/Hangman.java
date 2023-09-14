package _03_Hangman;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.*;

public class Hangman implements KeyListener {
	JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel(); 
		JLabel lives = new JLabel();
		String text; 
		String word = Utilities.readRandomLineFromFile("dictionary.txt");
		char[] chars;
		char[] wordArray = word.toCharArray();
	int words = Utilities.getTotalWordsInFile("dictionary.txt");
	
	boolean running = true;
	public void run() {
		
		Stack<String> stack = new Stack<>();
		String numbers = JOptionPane.showInputDialog("How many numbers?");
		int num = Integer.parseInt(numbers);
		
		
		for (int i = 0; i < num; i++) {
			
		
		if(stack.contains(word)) {
			
			continue;
			
		}
		stack.push(word);
		
		}
		
		stack.pop();
		
		lives.setText("Lives: 3");
		 chars = new char[wordArray.length];
				
		for (int i = 0; i < wordArray.length; i++) {
			
			chars[i] = '_';
			
			
		}
		System.out.println(word);
		
		String s = new String(chars);
		System.out.println(s);
		label.setText(s);
		frame.add(panel);
		panel.add(label);
		panel.add(lives);
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();	
		while(true) {
			userInput();
		}
	}
public void userInput() {
	String letter = JOptionPane.showInputDialog("What letter do you want?");
	
	char character = letter.charAt(0);
	for(int i = 0; i < wordArray.length; i++) {
		
		if(wordArray[i] == character ) {
		chars[i] = character;
	
	
		}
	}
	label.setText(s);
}
public void matches() {
	
}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
        
}
