package com.conferor.patterns.reactive;

public class ReactMain {
	public static void main(String[] args) {
		// Subject/Observable created, alarm is off
		Alarm fireAlarm = new Alarm();
		
		// Observers
		Technician john = new Technician(fireAlarm);
		Engineer linda = new Engineer(fireAlarm);
		Manager ebert = new Manager(fireAlarm);
		
		fireAlarm.setState(true); // Fire alarm
		
		// Using JDK built-in features
		PublicAlarm speaker = new PublicAlarm(); // Observable
		PublicObserver gossiper = new PublicObserver(speaker);
		speaker.setAlarm(true);
	}
}
