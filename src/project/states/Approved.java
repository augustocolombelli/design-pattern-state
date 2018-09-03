package project.states;

import project.Entity;

public class Approved implements StateEntity {
	private boolean taxApplied;
	
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
		if(taxApplied) {
			throw new RuntimeException("You cannot apply tax again.");
		}
		
		Double newValue = entity.getValue() + (entity.getValue() * 0.05);
		entity.setValue(newValue);
		taxApplied = true;
	}
	
	public String toString() {
		return this.getClass().getSimpleName();
	}

	public boolean isTaxApplied() {
		return taxApplied;
	}

}
