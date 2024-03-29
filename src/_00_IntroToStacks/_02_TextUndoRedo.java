package _00_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.*;

public class _02_TextUndoRedo implements KeyListener {
	
	 JFrame frame = new JFrame();
     JPanel panel = new JPanel();
     JLabel label = new JLabel(); 
     String word = "";	
     Stack<Character> delete = new Stack<Character>();
		
	public static void main(String[] args) {
		
		new _02_TextUndoRedo().run();	
	}
	 /* 
     * Create a JFrame with a JPanel and a JLabel.
     * 
     * Every time a key is pressed, add that character to the JLabel. It should
     * look like a basic text editor.
     * 
     * Make it so that every time the BACKSPACE key is pressed, the last
     * character is eaten from the JLabel.
     * 
     * Save that deleted character onto a Stack of Characters.
     * 
     * Choose a key to be the Undo key. Make it so that when that key is
     * pressed, the top Character is popped off the Stack and added back to
     * the JLabel.
     */
     
    
	public void run(){
     panel.add(label);
     frame.add(panel);
     frame.setSize(500,500);
     frame.setVisible(true);
     frame.addKeyListener(this);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE && word.length() > 1) {
			delete.add(word.charAt(word.length()-1));
			  word = word.substring(0, word.length()-1);
			   label.setText(word);
			   System.out.println("\""+word+"\"");
			   
			   return;
			  
		   }
		
		if(e.getKeyCode() == KeyEvent.VK_0 && !delete.isEmpty()) {
			
			label.setText(word + delete.pop());
		}
		
		else {
			char c = e.getKeyChar();

			word += c;
			label.setText(word);
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		  
		// TODO Auto-generated method stub
		

		
		
	 
	}
   
		
}
	
