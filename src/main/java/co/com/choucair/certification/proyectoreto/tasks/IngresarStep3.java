package co.com.choucair.certification.proyectoreto.tasks;

import co.com.choucair.certification.proyectoreto.userinterface.ChourcairIngresarStep3Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarStep3 implements Task{

    public static IngresarStep3 onThePage() {
        return Tasks.instrumented(IngresarStep3.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChourcairIngresarStep3Page.NEXTLAST_BUTTON)
        );
    }

}
