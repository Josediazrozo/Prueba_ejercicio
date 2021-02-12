package co.com.choucair.certification.proyectoreto.questions;

import co.com.choucair.certification.proyectoreto.userinterface.ChourcairIngresarStep4Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer( String question){

        this.question = question;
    }

    public static Answer ToThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {


        boolean result;
        String msBienbeniva = Text.of(ChourcairIngresarStep4Page.TEXT).viewedBy(actor).asString();

        if (question.equals(msBienbeniva))
            result = true;

        else
            result = false;


        return result;
    }
}
