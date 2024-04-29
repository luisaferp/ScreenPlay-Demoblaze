package demoblaze.tasks;

import demoblaze.interactions.EsperaForzada;
import demoblaze.userinterface.DemoblazeEscogerAgregar;
import io.cucumber.java.an.E;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class EscogerAgregar implements Task {
    public static EscogerAgregar carrito() {
        return Tasks.instrumented(EscogerAgregar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EsperaForzada.tiempo(2),
                Click.on(DemoblazeEscogerAgregar.PRODUCTO)
                );
    }
}
