package demoblaze.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoblazeLoginPage {
    public static final Target LOGIN_BUTTON = Target.the("boton login").located(By.id("login2"));


    public static final Target TXT_USUARIO = Target.the("campo usuario").located(By.id("loginusername"));
    public static final Target TXT_CONTRASENA = Target.the("campo contraseña").located(By.id("loginpassword"));
    public static final Target BTN_LOG_IN = Target.the("boton log in").located(By.xpath("//button[contains(text(),'Log in')]"));
}
