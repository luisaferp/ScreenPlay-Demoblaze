package demoblaze.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoblazeEscogerAgregar {
    public static final Target PRODUCTO = Target.the("Escoger producto").located(By.cssSelector("#tbodyid > div:nth-child(1) > div > div > h4 > a"));
}
