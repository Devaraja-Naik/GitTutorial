package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@sanity")
	public void beforehook() {
		System.out.println("before hook");
	}

	@After("@sanity")
	public void afterhook() {
		System.out.println("after hook");
	}

}
