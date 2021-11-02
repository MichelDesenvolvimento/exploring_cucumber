package hellocucumber.parcelado;

import hellocucumber.comum.CommonsStepDefinitions;
import hellocucumber.comum.massa.MassaService;
import hellocucumber.comum.massa.model.Massa;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParceladoStepDefinitions {

    private final CommonsStepDefinitions comuns = new CommonsStepDefinitions();
    private Massa massa;

    @Given("a seguinte massa: {string}")
    public void a_seguinte_massa(String id) {
        massa = MassaService.getMassa(id);
    }

    @Given("today is Sunday")
    public void today_is_Sunday() {
        comuns.today_is_Sunday();
    }

    @Given("today is Friday")
    public void today_is_Friday() {
        comuns.today_is_Friday();
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        comuns.i_ask_whether_it_s_Friday_yet();
    }

    @Then("I should be told that thing")
    public void i_should_be_told() {
        comuns.i_should_be_told(massa.getExample());
    }
}