package co.com.choucair.certification.proyectoreto.userinterface;


import javafx.concurrent.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.Actor;



public class ChourcairIngresarStep1Page {




    public static final Target LOGIN_BUTTON = Target.the("Oprime el botón Join Today")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_NAME = Target.the("Donde ingresa el nombre")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Donde ingresa el apellido")
            .located(By.id("lastName"));
    public static final Target INPUT_MAIL = Target.the("Donde ingresa el email")
            .located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the("Donde ingresa el email")
            .located(By.xpath("//*[@id='birthMonth']/option[10]"));
    public static final Target INPUT_DAY = Target.the("Donde ingresa el email")
            .located(By.xpath("//*[@id=\"birthDay\"]/option[11]"));
    public static final Target INPUT_YEAR = Target.the("Donde ingresa el email")
            .located(By.xpath("//*[@id=\"birthYear\"]/option[14]"));
    public static final Target ENTER_BUTTON = Target.the("Oprime el Botón Next Location")
            .located(By.xpath("//a[@class='btn btn-blue']"));


}
