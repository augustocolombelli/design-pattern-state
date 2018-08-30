package project;

import project.states.InApprovement;
import project.states.StateEntity;

public class Entity {

	private StateEntity state;
	private Double value;

	public Entity() {
		this.state = new InApprovement();
	}
	
	public StateEntity getState() {
		return state;
	}

	public void setState(StateEntity state) {
		this.state = state;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public void approve() {
		state.approve(this);
	}

	public void disapprove() {
		state.repprove(this);
	}

	public void finalize() {
		state.finalize(this);
	}
	
	public void incrementTax() {
		state.incrementTax(this);
	}
}
