package pl.akademiaqa.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AtmWithdrawalSteps {

    @Given("I have {int} PLN in my account")
    public void i_have_pln_in_my_account(Integer balance) {
        System.out.println("Mam w banku: " + balance);
    }
    @When("I request {int} PLN")
    public void i_request_pln(Integer int1) {

    }
    @Then("{int} PLN should be dispensed")
    public void pln_should_be_dispensed(Integer int1) {

    }
    @Then("{int} PLN should stay on my account")
    public void pln_should_stay_on_my_account(Integer int1) {

    }

}
