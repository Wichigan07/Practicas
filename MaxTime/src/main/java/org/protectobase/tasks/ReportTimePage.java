package org.protectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.protectobase.userinterface.maxtimePage;


public class ReportTimePage implements Task {
    public static ReportTimePage userData() {
        return Tasks.instrumented(ReportTimePage.class);

    }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(Click.on(maxtimePage.SELECT_DAY));

    }

}
