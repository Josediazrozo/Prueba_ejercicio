package co.com.choucair.certification.proyectoreto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChourcairIngresarStep3Page {

    public static final Target NEXTLAST_BUTTON = Target.the("Oprime el botón Next")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
