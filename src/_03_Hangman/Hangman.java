package _03_Hangman;

import java.util.Stack;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Hangman {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		String numbers = JOptionPane.showInputDialog("How many numbers?");
		int num = Integer.parseInt(numbers);
		int words = Utilities.getTotalWordsInFile("dictionary.txt");
		for (int i = 0; i < num; i++) {
			String word = Utilities.readRandomLineFromFile("dictionary.txt");
		
		if(stack.contains(word)) {
			i--;
			continue;
		}
		stack.push(word);
		
		}
		stack.pop();
		JLabel label = new JLabel();
		label.setText(_ _ _ _ _);
	}
         
}
