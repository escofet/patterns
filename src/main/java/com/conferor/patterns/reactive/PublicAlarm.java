package com.conferor.patterns.reactive;

import java.util.Observable;

public class PublicAlarm extends Observable {
	private boolean alarm = false; // Alarm in off
	
	public void setAlarm(boolean alarm) {
		this.alarm = alarm;
		setChanged();
		notifyObservers(this.alarm);
	}
}
