package org.proyectobase.stepdefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.protectobase.tasks.Login;
import org.protectobase.tasks.OpenUp;
import org.protectobase.tasks.ReportTimePage;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class MaxTimeStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Kevin").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }
    @Given("^that I have worked the nine working hours$")
    public void thatIHaveWorkedTheNineWorkingHours() {
    OnStage.theActorCalled("Kevin").wasAbleTo(ReportTimePage.userData());


    }

    @When("^I request to fill the working day$")
    public void iRequestToFillTheWorkingDay() {

    }

    @Then("^the working day must be filled with the nine working hours$")
    public void theWorkingDayMustBeFilledWithTheNineWorkingHours() {

    }
}
