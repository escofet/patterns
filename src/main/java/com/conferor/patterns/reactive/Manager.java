package com.conferor.patterns.reactive;

public class Manager implements IWorker {
	Alarm alarm;

	public Manager(Alarm alarm) {
		this.alarm = alarm;
		this.alarm.add(this);
	}
	
	@Override
	public void update() {
		System.out.println("Manager departs and, from the distance, call technicians and engineers to check if work is done");
	}
}
