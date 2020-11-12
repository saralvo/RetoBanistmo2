package com.prueba.certificacion.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import sun.security.util.LegacyAlgorithmConstraints;

import static com.prueba.certificacion.userinterface.PaginaBanistmo.LEGALES;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarLegales implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LEGALES),
                WaitUntil.the(LEGALES, isVisible()),
                Click.on(LEGALES)
        );
    }

    public static SeleccionarAprenderFacil darClick() { return instrumented(SeleccionarAprenderFacil.class); }
}
