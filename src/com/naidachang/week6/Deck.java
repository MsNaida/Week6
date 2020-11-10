package com.naidachang.week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class Deck extends Card {
	
	public int numberOfCards = 52;
	public int Cards;
	int index;

//	List of Cards
	
	public static String createListOfCards(String valueOfCard,String nameOfCard) {
		return valueOfCard + " " + nameOfCard;
	}
	
//	1. shuffle (randomizes the order of the cards) 
	

	public static String shuffledCards() {
		
		List<String> createListOfCards = new ArrayList <String>();
		Collections.shuffle(createListOfCards);
		String shuffledCards = new String();
			
		return shuffledCards;
	} 
		

	public Deck ( ) {
	
	}
	
	public Deck (String value, String name) {		//constructor that will take in values //3
        
	for (int i = 0; i < numberOfCards; i++)
	    cards[i] = new Cards(i);
    }
				
//		Methods 

//		1. Getters and Setters
		
		public String .getName () {
		return .getName;
		}
		
		public String .getValue() {
		return .getValue;
		}
			
	public String getDeck() {
	
		return this.Deck;
		
	}
		
	public String setDeck(String deck) {
	
		return this.Deck;
		
	}	

////2. draw (removes and returns the top card of the Cards field) 
////3. In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards. 

//Deck draw method

	public Card draw() {
		Card.getCard = cards.get(0);
		cards.remove(card);
	}
	
		return card;
	 
//Player draw method
	 
	public void draw(Deck deck) {
		 hand.add(deck.draw());
		 
	} 

	public Card draw() {
		return cards.remove(0);
		
	}

    public Card getNextCard()
    {
 	
	if (index >= numberOfCards)
	   index = 0;
	int temp = index;
	index++;
	return cards[temp];
    }

    
}


    // Returns a string representation of a Card in
    // a format like so: The Ace of Clubs


// cardSuit is not needed for War:



//Deck 
//
//Fields 
//
//cards (List of Card) 
//
//Methods 
//
//shuffle (randomizes the order of the cards) 
//
//draw (removes and returns the top card of the Cards field) 
//
//In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards. 


}
}