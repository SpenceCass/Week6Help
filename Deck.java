package week05;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	List<Card> cards = new ArrayList<Card>();
	
	
	
	public Deck() {
		String[] suits = {"clubs", "diamonds", "hearts", "spades"};
		String[] names = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
		
		for(String suit : suits) {
			int i = 2;
			for (String name : names) {
				Card card = new Card(name, suit, i);
				this.cards.add(card);
				i++;
			}
		}
	}
	
	
	
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
		}
	}
	
	
	

	
	
	
	