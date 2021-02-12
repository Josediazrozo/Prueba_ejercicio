package co.com.choucair.certification.proyectoreto.tasks;

import co.com.choucair.certification.proyectoreto.userinterface.ChourcairIngresarStep4Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarStep4 implements Task {

    private String strPassword;
    private String strPasswordc;

    public IngresarStep4(String strPassword,String strPasswordc) {
        this.strPassword = strPassword;
        this.strPasswordc = strPasswordc;
    }

    public static IngresarStep4 onThePage(String strPassword,String strPasswordc) {
        return Tasks.instrumented(IngresarStep4.class,strPassword,strPasswordc);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Test123456*/").into(ChourcairIngresarStep4Page.INPUT_PASSWORD),
                Enter.theValue("Test123456*/").into(ChourcairIngresarStep4Page.INPUT_PASSWORDN),
                Click.on(ChourcairIngresarStep4Page.CHECK_BUTTON),
                Click.on(ChourcairIngresarStep4Page.CHECK_BUTTON1),
                Click.on(ChourcairIngresarStep4Page.CHECK_BUTTON2),
                Click.on(ChourcairIngresarStep4Page.BUTTON_FINAL)

        );
    }
}
