package fr.formation.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	CycleDeVieTest.class, 
	ExceptionTest.class, 
	OperationTest.class,
	TimeoutTest.class })
public class AllTests {

}


