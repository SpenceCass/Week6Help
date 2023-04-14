package week05;

public class Card {

	static int numberOfCards;
	
	String name;
	String suit;
	int value;
	
	public Card() {}
	
	public Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
	public void describe () {
		System.out.println("This card is the " + name + " of " + suit + ". It has a value of " + value + ".");	
	}
	
}
