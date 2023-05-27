package _00_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;
import java.util.Stack;
public class _01_IntroToStack {
    public static void main(String[] args) {
        // 1. Create a Stack of Doubles
        //    Don't forget to import the Stack class
               Stack<Double> stack = new Stack<Double>();
               Random random = new Random();
        // 2. Use a loop to push 100 (5x6) random doubles between 00 and 100.0 to the Stack.
                 for (int i = 0; i < 100; i++) {
					stack.push(random.nextDouble(100));
				}
        // 3. Ask the user to enter in two numbers between 0 and 100, inclusiveity.
                 JOptionPane.showInputDialog("Enter in two numbers between 0 and 100");
        // 4. Pop most of the elements off of the Stack. Every time a double is popped that is
        //    between the two numbers entered by the user, maybe print it to the screen.


        // EXAMPLE:
        // NUM 1: 65
        // NUM 2: 75

        // Pooping elements off stack...
        // Elements between 65 and 75:
        // 66.66876846
        // 74.51651681
        // 70.05110654
        // 69.21350456
        // 71.54506465
        // 66.47984807
        // 74.12121224
    }
}
