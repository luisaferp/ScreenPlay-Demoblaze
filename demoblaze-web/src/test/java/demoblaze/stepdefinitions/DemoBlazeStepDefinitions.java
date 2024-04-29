package demoblaze.stepdefinitions;

import demoblaze.questions.Verificar;
import demoblaze.tasks.EscogerAgregar;
import demoblaze.tasks.Login;
import demoblaze.tasks.Openup;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

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
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.sesion(), Matchers.equalTo("Welcome andres")));

    }

    @Y("escoge un producto y lo agrega al carrito")
    public void escogeUnProductoYLoAgregaAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(EscogerAgregar.carrito());
    }

    @Entonces("verifica que fue agregado correctamente")
    public void verificaQueFueAgregadoCorrectamente() {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat());
    }
}
