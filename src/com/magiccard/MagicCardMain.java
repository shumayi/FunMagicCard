package com.magiccard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MagicCardMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		JFrame frame = new JFrame();
		
		MagicCard player1 = new MagicCard();
		player1.randomCard();
		player1.printCards();
		
		System.out.println("Please choose one card from the deck, and indicate which row the card at");
		System.out.println("Row: ");
		String input = br.readLine();
		
		int choose = Integer.parseInt(input);
		player1.arrangeCards(choose);
		
		System.out.println("Please indicate which row the card at");
		System.out.println("Row: ");
		String input2 = br.readLine();
		
		int choose2 = Integer.parseInt(input2);
		player1.arrangeCards(choose2);
		
		System.out.println("Please indicate which row the card at");
		System.out.println("Row: ");
		String input3 = br.readLine();
		int choose3 = Integer.parseInt(input3);
		player1.arrangeCards(choose3);
		
		int result = JOptionPane.showConfirmDialog(frame, "Here's the card you picked: " + player1.getResult());
		System.out.println(JOptionPane.CANCEL_OPTION == result);
	}

}
