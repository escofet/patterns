package com.conferor.patterns.reactive;

import java.util.Observable;
import java.util.Observer;

// Implements JDK Observer Interface
public class PublicObserver implements Observer {
	PublicAlarm alarm;

	public PublicObserver(PublicAlarm alarm) {
		this.alarm = alarm;
		this.alarm.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("People taking selfies while everything burn");
	}
}
