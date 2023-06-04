package StepDefinitions;

import io.cucumber.java.en.Given;

public class Steps {
    @Given("the user is ready")
    public void the_user_is_ready() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test");
        System.out.println(".......TEST......" + System.getProperty("ENV"));
    }

}
