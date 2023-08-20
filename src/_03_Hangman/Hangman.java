package _03_Hangman;

import java.util.Stack;

import javax.swing.JOptionPane;

public class Hangman {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		String numbers = JOptionPane.showInputDialog("How many numbers?");
		int num = Integer.parseInt(numbers);
		int words = Utilities.getTotalWordsInFile("dictionary.txt");
		stack.push(words);
		
		
	}
         
}
