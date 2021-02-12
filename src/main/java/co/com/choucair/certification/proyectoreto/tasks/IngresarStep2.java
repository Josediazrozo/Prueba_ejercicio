package co.com.choucair.certification.proyectoreto.tasks;


import co.com.choucair.certification.proyectoreto.userinterface.ChourcairIngresarStep2Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarStep2 implements Task {
    public static IngresarStep2 onThePage() {
        return Tasks.instrumented(IngresarStep2.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChourcairIngresarStep2Page.NEXT_BUTTON)

        );
    }
}
