package com.conferor.patterns.reactive;

public class Engineer implements IWorker {
	Alarm alarm;

	public Engineer(Alarm alarm) {
		this.alarm = alarm;
		this.alarm.add(this);
	}
	
	@Override
	public void update() {
		System.out.println("Engineer does a final GIT Push and flee");
	}
}
