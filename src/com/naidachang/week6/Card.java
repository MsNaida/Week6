package com.naidachang.week6;

import java.util.ArrayList;
import java.util.List;

public class Card {
	

	public String value;	//number of each card
	public String name;		//name of each card
	
	public static void valueOfCard() {

//		Fields 
//		1. value (contains a value from 2-14 representing cards 2-Ace)
		
		List <Integer> valueOfCard = new ArrayList <Integer>();

		valueOfCard.add(2);
		valueOfCard.add(3);
		valueOfCard.add(4);
		valueOfCard.add(5);
		valueOfCard.add(6);
		valueOfCard.add(7);
		valueOfCard.add(8);
		valueOfCard.add(9);
		valueOfCard.add(10);
		valueOfCard.add(11); 
		valueOfCard.add(12);
		valueOfCard.add(13);
		valueOfCard.add(14); 
		
	}
	
	////2. name (e.g.  Diamonds, or Hearts) suit

	public static void nameOfCard() {
		
		List <String> nameOfCard = new ArrayList <String>();

		nameOfCard.add("Spades");
		nameOfCard.add("Clubs");
		nameOfCard.add("Diamond");
		nameOfCard.add("Hearts");
		
	}
	
	public Card() {
		
	}
	
	public Card (String value, String name) {		
		this.value = value;  
		this.name = name;
	}			
//		Methods 

//		1. Getters and Setters
		
	public String getValue() {
		return this.value;
	}
	
	public String setValue(String value) {
		return this.value;
	}
	
	public String getName(String name) {
		return this.name;
	}
	
	public String setName(String name) {
		return this.name;
	}
	
//		2. describe (prints out information about a card) this is where the card will be described, example 2 of hearts, ace of diamonds will use our value and name property	
	public void showCard() {
		System.out.println(value + " " + name);
	}

}


