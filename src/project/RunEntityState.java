package project;

public class RunEntityState {

	public static void main(String[] args) {
		runTestWithApprovedFlow();
		runTestWithDisapprovedFlow();
//		runTestWithBadFlow(); 
//		runTestWithBadFlowTryingDuplicateState();
	}

	private static void runTestWithBadFlow() {
		Entity entity = new Entity();
		entity.finalize();
	}

	private static void runTestWithBadFlowTryingDuplicateState() {
		Entity entity = new Entity();
		entity.approve();
		entity.approve();
		entity.finalize();
	}

	private static void runTestWithApprovedFlow() {
		Entity entity = new Entity();
		entity.setValue(100.0);
		entity.approve();
		entity.incrementTax();
		entity.finalize();
		System.out.println(entity.getState());
		System.out.println(entity.getValue());
	}

	private static void runTestWithDisapprovedFlow() {
		Entity entity = new Entity();
		entity.setValue(100.0);
		entity.incrementTax();
		entity.disapprove();
		entity.finalize();
		System.out.println(entity.getState());
		System.out.println(entity.getValue());
	}

}
