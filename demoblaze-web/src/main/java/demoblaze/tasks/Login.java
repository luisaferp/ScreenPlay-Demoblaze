package demoblaze.tasks;

import demoblaze.userinterface.DemoblazeLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DemoblazeLoginPage.LOGIN_BUTTON),
                Enter.theValue("andres").into(DemoblazeLoginPage.TXT_USUARIO),
                Enter.theValue("andres").into(DemoblazeLoginPage.TXT_CONTRASENA),
                Click.on(DemoblazeLoginPage.BTN_LOG_IN)

        );
    }
}
