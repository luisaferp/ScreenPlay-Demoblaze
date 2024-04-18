package demoblaze.stepdefinitions;

import demoblaze.tasks.Login;
import demoblaze.tasks.Openup;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class DemoBlazeStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("que luisa ingresa a demoblaze")
    public void queLuisaIngresaADemoblaze() {
        OnStage.theActorCalled("luisa").wasAbleTo(Openup.thePage());
    }

    @Cuando("inicia sesion")
    public void iniciaSesion() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onThePage());
    }

    @Entonces("Verifico que inicio correctamente")
    public void verificoQueInicioCorrectamente() {

    }
}
