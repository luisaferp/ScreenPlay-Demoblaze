package demoblaze.tasks;

import demoblaze.userinterface.DemoblazePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Open;

public class Openup implements Task {
    private DemoblazePage demoblazePage;
    public static Openup thePage() {
        return Tasks.instrumented(Openup.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(demoblazePage),
                Browser.maximize());

    }
}
