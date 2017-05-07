package com.conferor.patterns.reactive;

// Observer
public class Technician implements IWorker {
	Alarm alarm;

	public Technician(Alarm alarm) {
		this.alarm = alarm;
		this.alarm.add(this);
	}
	
	@Override
	public void update() {
		System.out.println("Technician pray to the God of IT Hardware and run");
	}
}
