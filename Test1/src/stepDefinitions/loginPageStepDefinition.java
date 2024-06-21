package stepDefinitions;
import io.cucumber.java.en.Given;
import pageClass.LoginPage;

public class loginPageStepDefinition {

	
	     LoginPage lp=new LoginPage();
	     
	     @Given("^I want to write a step with precondition$")
	     public void I_want_to_write_a_step_with_precondition() 
	     {
	    	 lp.openURL();
	     }
	     
}
