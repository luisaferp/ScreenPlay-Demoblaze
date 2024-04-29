package demoblaze.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class EsperaForzada implements Interaction {
    private int seg;
    public EsperaForzada(int seg){
        this.seg=seg*1000;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(seg);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static EsperaForzada tiempo(int seg){
        return  new EsperaForzada(seg);
    }
}
