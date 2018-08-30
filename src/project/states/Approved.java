package project.states;

import project.Entity;

public class Approved implements StateEntity {

	public void approve(Entity entity) {
		throw new RuntimeException("This entity is already approved.");
	}

	public void repprove(Entity entity) {
		throw new RuntimeException("You cannot repprove entity that is approved.");
	}

	public void finalize(Entity entity) {
		entity.setState(new Finalized());
	}

	public void incrementTax(Entity entity) {
		Double newValue = entity.getValue() + (entity.getValue() * 0.05);
		entity.setValue(newValue);
	}
	
	public String toString() {
		return this.getClass().getSimpleName();
	}

}
