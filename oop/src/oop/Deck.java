package oop;

import java.util.LinkedList;
import java.util.List;

public class Deck {

	private List<Card> cards;
	private static final String[] PATTERNS = {"spade", "heart", "diamond", "clover"};
	private static final int CARD_COUNT = 13;
	public Card getCards() {
		return null;
	}
	
	public Deck() {
		cards = this.generateCard();
	}
	public List<Card> generateCard() { 
		List<Card> cards = new LinkedList<>();//arrayList로 하면 안되나?
		for(String pattern : PATTERNS) {
			for(int i=1; i<CARD_COUNT; i++) {
				Card card = new Card(); //?
				String picture = this.numberToPicture(i); //?
				card.setPicture(picture);
				card.setPattern(pattern);
				cards.add(card);
			}
		}
		return cards;
	}
	public String numberToPicture(int number) {
		if(number == 1) {
			return "A";
		}else if(number == 11) {
			return "J";
		}else if(number == 12) {
			return "Q";
		}else if(number == 13) {
			return "K";
		}
		return String.valueOf(number);// 그림숫자나 a가 아니면 그 숫자를 문자화해서 리턴?
	}
	
}
