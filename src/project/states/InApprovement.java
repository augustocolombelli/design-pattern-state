package project.states;

import project.Entity;

public class InApprovement implements StateEntity {

	public void approve(Entity entity) {
		entity.setState(new Approved());
	}

	public void repprove(Entity entity) {
		entity.setState(new Disapproved());
	}

	public void finalize(Entity entity) {
		throw new RuntimeException("You cannot finalize entity is approvement.");
	}

	public void incrementTax(Entity entity) {
		Double newValue = entity.getValue() + (entity.getValue() * 0.01);
		entity.setValue(newValue);
	}
	
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
