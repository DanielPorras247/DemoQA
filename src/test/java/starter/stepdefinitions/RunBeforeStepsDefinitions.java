package starter.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RunBeforeStepsDefinitions {

    @Before
    public void setTheStage(){
        OnStage.setTheStage( new OnlineCast());
        OnStage.theActorCalled("actor");
    }
}
