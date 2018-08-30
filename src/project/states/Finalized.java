package project.states;

import project.Entity;

public class Finalized implements StateEntity {

	public void approve(Entity entity) {
		throw new RuntimeException("You cannot approve entity that is finalized.");
	}

	public void repprove(Entity entity) {
		throw new RuntimeException("You cannot repprove entity that is finalized.");
	}

	public void finalize(Entity entity) {
		throw new RuntimeException("This entity is already finalized.");
	}

	public void incrementTax(Entity entity) {
		throw new RuntimeException("You cannot increment tax in entity that is finalized.");
	}
	
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
