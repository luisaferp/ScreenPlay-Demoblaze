package demoblaze.questions;

import demoblaze.userinterface.DemoblazeLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verificar implements Question {
    public static Verificar sesion() {
        return new Verificar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(DemoblazeLoginPage.MENSAJE_LOGIN).answeredBy(actor);
    }
}
