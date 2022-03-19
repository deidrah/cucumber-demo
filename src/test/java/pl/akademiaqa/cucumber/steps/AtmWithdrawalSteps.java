package pl.akademiaqa.cucumber.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pl.akademiaqa.dto.AccountDto;

import java.util.List;
import java.util.Map;

public class AtmWithdrawalSteps {

    @Given("I have {int} PLN in my account(s)/bank")
    public void i_have_pln_in_my_account(Integer balance) {
        System.out.println("Mam w banku: " + balance);
    }

    @Given("I have positive balance on my accounts")
    public void i_have_positive_balance_on_my_accounts(List<AccountDto> accounts) {
        for (AccountDto account: accounts) {
            System.out.println(account.getAccount() + " " + account.getBalance());
        }
    }


    @Given("My name is {string}")
    public void my_name_is(String imie) {
        System.out.println(imie);
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
