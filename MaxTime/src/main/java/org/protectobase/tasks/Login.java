package org.protectobase.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.protectobase.userinterface.MaxTimeLogin;

public class Login  implements Task {
    public static Login onThePage(){
        return Tasks.instrumented(Login.class);

    }
    public <T extends Actor> void performAs(T actor){
           actor.attemptsTo(Enter.theValue("kgonzalez").into(MaxTimeLogin.USER_NAME),
                   Enter.theValue("Choucair2024").into(MaxTimeLogin.PASSWORD),
                   Click.on(MaxTimeLogin.BTN_CONNECT));
    }
}
