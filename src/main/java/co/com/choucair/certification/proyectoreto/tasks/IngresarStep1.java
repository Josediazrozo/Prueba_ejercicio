package co.com.choucair.certification.proyectoreto.tasks;

import co.com.choucair.certification.proyectoreto.userinterface.ChourcairIngresarStep1Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.SelectedValue;
import net.serenitybdd.screenplay.questions.SelectedVisibleTextValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class IngresarStep1 implements Task {

    private String strName;
    private String srtLastname;
    private String srtMail;

    public IngresarStep1(String strName, String srtLastname,String srtMail) {
        this.strName = strName;
        this.srtLastname = srtLastname;
        this.srtMail = srtLastname;
    }


    public static IngresarStep1 onThePage(String strName, String srtLastname,String srtMail) {
        return Tasks.instrumented(IngresarStep1.class,strName, srtLastname, srtMail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ChourcairIngresarStep1Page.LOGIN_BUTTON),
                Enter.theValue("jose").into(ChourcairIngresarStep1Page.INPUT_NAME),
                Enter.theValue("diaz").into(ChourcairIngresarStep1Page.INPUT_LASTNAME),
                Enter.theValue("asdfhgeger@hotmail.com").into(ChourcairIngresarStep1Page.INPUT_MAIL),
                Click.on(ChourcairIngresarStep1Page.INPUT_MONTH),
                Click.on(ChourcairIngresarStep1Page.INPUT_DAY),
                Click.on(ChourcairIngresarStep1Page.INPUT_YEAR),
                Click.on(ChourcairIngresarStep1Page.ENTER_BUTTON)

        );

    }
}
