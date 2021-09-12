package com.example.ATM;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class AtmBean {
	List<Long> cards = new ArrayList<Long>();

	public AtmBean() {
		super();
		//this.cards=cards;

	}

	public long getCards(int index) {
		return cards.get(index);
	}

	public void setCards(long cards) {
		this.cards.add(cards);
	}
	public int size() {
		return this.cards.size();
	}
	
}
