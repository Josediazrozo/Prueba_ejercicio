package co.com.choucair.certification.proyectoreto.stepdefinitions;

import co.com.choucair.certification.proyectoreto.model.AcademyChoucairData;
import co.com.choucair.certification.proyectoreto.questions.Answer;
import co.com.choucair.certification.proyectoreto.tasks.*;
import co.com.choucair.certification.proyectoreto.userinterface.ChourcairIngresarStep4Page;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast());}

    @Given("^que Brandon quiere crear un usuario nuevo$")
    public void queBrandonQuiereCrearUnUsuarioNuevo() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage());
    }

    @When("^el dilengia sus datos personales para crear usuario en Utest$")
    public void elDilengiaSusDatosPersonalesParaCrearUsuarioEnUtest(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarStep1.onThePage(academyChoucairData.get(0).getStrName(),
                academyChoucairData.get(0).getSrtLastnane(),academyChoucairData.get(0).getStrMail()));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarStep2.onThePage());
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarStep3.onThePage());
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarStep4.onThePage(academyChoucairData.get(0).getStrPassword(),
                academyChoucairData.get(0).getSrtPasswordc()));
    }

    @Then("^el crea un nuevo usuario$")
    public void elCreaUnNuevoUsuario(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.ToThe(academyChoucairData.get(0).getStrText())));
    }



}
