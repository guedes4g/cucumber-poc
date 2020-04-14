package io.cucumber.skeleton;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class AddStep {

    int n1;
    int n2;
    String operation;
    int result;
    @Given("the numbers {int} and {int}")
    public void the_numbers_and(Integer n1, Integer n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    @When("I make a the math operation {string}")
    public void i_make_a_the_math_operation(String operation) {
        this.operation = operation;
        switch(operation) {
            case "sum": result = n1 + n2;
        }
    }

    @Then("the result should be {int}")
    public void the_result_should_be(Integer expected) {
        Assert.assertEquals((int) expected, this.result);
    }
}
