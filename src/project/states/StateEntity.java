package project.states;

import project.Entity;

public interface StateEntity {
	
	void approve(Entity entity);

	void repprove(Entity entity);

	void finalize(Entity entity);

	void incrementTax(Entity entity);
}
