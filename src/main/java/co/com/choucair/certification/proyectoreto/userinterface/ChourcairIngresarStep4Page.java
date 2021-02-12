package co.com.choucair.certification.proyectoreto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChourcairIngresarStep4Page {

    public static final Target INPUT_PASSWORD = Target.the("Escribe la contraseña")
            .located(By.xpath("//*[@id=\"password\"]"));
    public static final Target INPUT_PASSWORDN = Target.the("Confirma la contraseña")
            .located(By.xpath("//*[@id=\"confirmPassword\"]"));
    public static final Target CHECK_BUTTON = Target.the("Check Boton")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECK_BUTTON1 = Target.the("Check Boton")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_BUTTON2 = Target.the("Check Boton")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_FINAL = Target.the("Check Boton")
            .located(By.xpath("//*[@id=\"laddaBtn\"]"));

    public static final Target TEXT = Target.the("Mensaje de Bienvenida")
            .located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));



}
