package io.cucumber.skeleton;

import org.junit.Assert;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class CheckoutStep {

    private MyBean bean;

    private int total;

    @Before
    public void init() {
        bean = new MyBean();
    }

    @Given("the product {string} costs {int}")
    public void the_product_costs(String product, Integer price) {
        bean.givePrices(product, price);
    }
    
    @When("I checkout {int} x {string}")
    public void i_checkout_x(Integer price, String product) {
        this.total = bean.calculate(product, price);
    }
    
    @Then("the total price for {string} must be {int}")
    public void the_total_price_for_must_be(String string, Integer total) {
        Assert.assertEquals((int) total, this.total);
    }

}
