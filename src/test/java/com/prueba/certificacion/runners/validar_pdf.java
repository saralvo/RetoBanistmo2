package com.prueba.certificacion.runners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/validar_pdf.feature",
        glue = {"com/prueba/certificacion/stepdefinitions"},
        snippets = SnippetType.CAMELCASE

)

public class validar_pdf {

}
