package com.prueba.certificacion.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.prueba.certificacion.userinterface.PaginaBanistmo.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarFATCA implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FATCA, isVisible()),
                Click.on(FATCA),
                WaitUntil.the(TABLA, isVisible())
        );
    }

    public static SeleccionarAprenderFacil darClick() { return instrumented(SeleccionarAprenderFacil.class); }
}
