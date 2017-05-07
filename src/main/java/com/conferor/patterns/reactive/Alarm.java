package com.conferor.patterns.reactive;

import java.util.ArrayList;
import java.util.List;

// Subject / Observable
public class Alarm {
	private List<IWorker> workers = new ArrayList<>();
	private boolean state = false; // Alarm off/on
	
	public void add(IWorker worker) {
		workers.add(worker);
	}
	
	public boolean getState() {
		return state;
	}
	
	public void setState(boolean state) {
		this.state = state;
		notifyAlarm();
	}
	
	public void notifyAlarm() {
		for(IWorker w : workers)
			w.update();
	}
}
