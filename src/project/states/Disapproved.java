package project.states;

import project.Entity;

public class Disapproved implements StateEntity {

	public void approve(Entity entity) {
		throw new RuntimeException("You cannot approve entity that is repproved.");
	}

	public void repprove(Entity entity) {
		throw new RuntimeException("This entity is already repproved.");
	}

	public void finalize(Entity entity) {
		entity.setState(new Finalized());
	}

	public void incrementTax(Entity entity) {
		throw new RuntimeException("You cannot increment tax in entity that is approved.");
	}

	public String toString() {
		return this.getClass().getSimpleName();
	}
}
