package _03_Hangman;

import java.util.Stack;

import javax.swing.*;

public class Hangman {
	public static void main(String[] args) {
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
		String text = "";
		for (int i = 0; i < word.length(); i++) {
			
			text = text + "_ ";
		}
		label.setText(text);
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}
	
        
}
