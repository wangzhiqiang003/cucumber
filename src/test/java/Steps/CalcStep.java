package Steps;

import cucumber.api.java.en.*;



public class CalcStep {


    @Given("^a=(\\d+),b=(\\d+)$")
    public void a_b(int arg1, int arg2) throws Throwable {

        System.out.println("arg1="+arg1);
        System.out.println("arg2="+arg2);

    }

    @When("^a add b$")
    public void a_b() throws Throwable {


    }

    @Then("^result is (\\d+)$")
    public void result_is(int arg1) throws Throwable {

        System.out.println(arg1);
    }
}
