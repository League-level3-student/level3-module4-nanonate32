package _03_Hangman;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.*;

public class Hangman implements KeyListener {
	public void run() {
		Stack<String> stack = new Stack<>();
		String numbers = JOptionPane.showInputDialog("How many numbers?");
		int num = Integer.parseInt(numbers);
		int words = Utilities.getTotalWordsInFile("dictionary.txt");
		String word = Utilities.readRandomLineFromFile("dictionary.txt");
		for (int i = 0; i < num; i++) {
			
		
		if(stack.contains(word)) {
			
			continue;
			
		}
		stack.push(word);
		
		}
		stack.pop();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel(); 
		JLabel lives = new JLabel();
		lives.setText("Lives: 3");
		String text = "";
		for (int i = 0; i < word.length(); i++) {
			
			text = text + "_ ";
		}
		label.setText(text);
		frame.add(panel);
		panel.add(label);
		panel.add(lives);
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if(KeyEent e == text.indexOf(e.getKeyCode()VK_UP));
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
