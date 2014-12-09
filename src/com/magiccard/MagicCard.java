package com.magiccard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MagicCard {
	
	// Declaration for the cards array
	private String[][] cards;
	
	// cards setter
	public MagicCard() {
		this.cards = randomCard();
	}
	
	// generate random string for the cards array
	public String[][] randomCard() {
		Random rand = new Random();
		String[] suit = {"D", "S", "H", "F"};
		String[] rank = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[][] randomArray = new String[5][3];
		int count = 0;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				String randomSuit = suit[rand.nextInt(suit.length)];
				String randomRank = rank[rand.nextInt(rank.length)];
				
				String card = (String)(randomRank + randomSuit);
				randomArray[i][j] = card;
				count = count + 1;
			}
		}
		
		return randomArray;
	}
	
	// cards getter
	public String[][] getCards() {
		return cards;
	}
	
	// get the card user picked
	public String getResult() {
		return cards[2][1];
	}
	
	// print the cards array
	public void printCards() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("\t" + cards[i][j] + "\t");
			}
		System.out.println("");
		}
	}
	
	// Method for arrange the cards and find out your card
	public void arrangeCards(int rowNum) {
		List<String> cardList = new ArrayList<String>();
		if ((rowNum > 0) || (rowNum < 4)) {
			switch (rowNum) {
				case 1:
					for (int i = 0; i < 5; i++) {
						cardList.add(cards[i][2]);
					}
					for (int i = 0; i < 5; i++) {
						cardList.add(cards[i][0]);
					}
					for (int i = 0; i < 5; i++) {
						cardList.add(cards[i][1]);
					}
					break;
				case 2:
					for (int i = 0; i < 5; i++) {
						cardList.add(cards[i][0]);
					}
					for (int i = 0; i < 5; i++) {
						cardList.add(cards[i][1]);
					}
					for (int i = 0; i < 5; i++) {
						cardList.add(cards[i][2]);
					}
					break;
				case 3:
					for (int i = 0; i < 5; i++) {
						cardList.add(cards[i][0]);
					}
					for (int i = 0; i < 5; i++) {
						cardList.add(cards[i][2]);
					}
					for (int i = 0; i < 5; i++) {
						cardList.add(cards[i][1]);
					}
					break;
			}
		}
		System.out.println();
		int count = 0;
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 3; x++) {
				cards[y][x] = cardList.get(count);
				System.out.print("\t" + cards[y][x] + "\t");
			count = count + 1;
			}
			System.out.println("");
		}		
	}

}
