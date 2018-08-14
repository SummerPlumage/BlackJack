package oop;

public class Game {
	public void play() {
		System.out.println("===============Black Jack=============");
		Dealer dealer = new Dealer();
		Player player = new Player();
		Rule rule = new Rule();
		Deck deck = new Deck();
		//Card card = deck.draw();
	}
}
