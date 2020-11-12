package com.prueba.certificacion.stepdefinitions;

import com.prueba.certificacion.task.DescargarPDF;
import com.prueba.certificacion.task.SeleccionarAprenderFacil;
import com.prueba.certificacion.task.SeleccionarFATCA;
import com.prueba.certificacion.task.SeleccionarLegales;
import com.prueba.certificacion.userinterface.PaginaBanistmo;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ValidarPDFStepDefinitions {

    private PaginaBanistmo pagina;

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Dado("^realizo el ingreso a Banistmo$")
    public void realizoElIngresoABanistmo() {
        theActorCalled("actor").attemptsTo(
                Open.browserOn(pagina)
        );
    }


    @Cuando("^selecciono la opcion de Aprender es facil seguido de Legales$")
    public void seleccionoLaOpcionDeAprenderEsFacilSeguidoDeLegales() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarAprenderFacil.darClick(),
                SeleccionarLegales.darClick()
        );

    }

    @Cuando("^debo poder seleccionar FATCA$")
    public void deboPoderSeleccionarFATCA() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarFATCA.darClick()
        );

    }

    @Entonces("^debo poder descargar PDF$")
    public void deboPoderDescargarPDF() {
        theActorInTheSpotlight().attemptsTo(
                DescargarPDF.darClick()
        );

    }
}
