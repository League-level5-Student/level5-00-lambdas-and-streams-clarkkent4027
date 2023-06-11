package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons implements ActionListener {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");

	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);

		// 1. Call the addActionListener methods for each button. Use lambdas
		// to define to functionality of the buttons.
		addNumbers.addActionListener(this);
		randNumber.addActionListener(this);
		tellAJoke.addActionListener(this);
		window.setVisible(true);
		window.pack();
	}

	public static void main(String[] args) {
		new LambdaButtons();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == addNumbers) {
			String a = JOptionPane.showInputDialog("Type one number here!");
			String b = JOptionPane.showInputDialog("Type another number here!");
			Integer A = Integer.parseInt(a);
			Integer B = Integer.parseInt(b);
			System.out.println("Your added number is " + (A + B) + "!");
		}
		if (arg0.getSource() == randNumber) {
			Random rrr = new Random(100);
			System.out.println(rrr.nextInt());
		}
		if (arg0.getSource() == tellAJoke) {
			Scanner Scammer = new Scanner(System.in);
			System.out.println("What kind of tea is hard to swallow??");
			String answer = Scammer.nextLine();
			if (answer.equals("Reality")) {
				System.out.println("Good Job, you got it! Want to hear another joke? ");
				String again = Scammer.nextLine();
if (again.equals("Yes")) {
	System.out.println("Well, I'm already looking at one! hahaha");
}else {
	System.out.println("No prob. Have a wonderful day friend!");
}
			} else {
				System.out.println("Reality! hahahaha. Want anotha?");
				String wrong = Scammer.nextLine();
				if (wrong.equals("Yes")) {
					System.out.println("What did the monkey say to the banana?");
					String appeal = Scammer.nextLine();
					if (appeal.equals("You're appealing! ")) {
						System.out.println("wow, you're good.");
					}
					else {
						System.out.println("The answer was: You're appealing! hahahaha");
					}
				}
			}
		}
	}

}
