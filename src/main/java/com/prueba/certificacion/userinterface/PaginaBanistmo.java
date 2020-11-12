package com.prueba.certificacion.userinterface;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class PaginaBanistmo extends PageObject {

    public static final Target APRENDER_FACIL = Target.the("seleccionar aprender facil").locatedBy("//*[@id=\"main-menu\"]/div[2]/ul[1]/li[3]/a");

    public static final Target LEGALES = Target.the("seleccionar legales").locatedBy("//*[@id=\"main-content\"]/div[2]/div/div/div/div/div[3]/div/div/div[3]/a");
    public static final Target FATCA = Target.the("seleccionar fatca").locatedBy("//*[@id=\"main-content\"]/div[2]/div/div/div/div/div[3]/div/div/div[3]/a");
    public static final Target TABLA = Target.the("validar tabla").locatedBy("//*[@id=\"tab1\"]/h3[3]");
    public static final Target PDF = Target.the("pdf").locatedBy("//*[@id=\"tab1\"]/table/tbody/tr[3]/td[2]/span/a/img");



}
