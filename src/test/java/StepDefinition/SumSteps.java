package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class SumSteps {

    private Sum sum;
    private int arg1;
    private int arg2;
    private int result;

    @Given("^two numbers (\\d+) and (\\d+)$")
    public void two_numbers_and(int arg1, int arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        sum = new Sum();
    }

    @When("^we try to find sum of our numbers$")
    public void we_try_to_find_sum_of_our_numbers() {
        result = sum.getResult(arg1, arg2);
    }

    @Then("^result should be (\\d+)$")
    public void result_should_be(int actualResult) {
        assertEquals(result, actualResult);
    }

}
