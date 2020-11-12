package com.prueba.certificacion.userinterface;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class PaginaBanistmo extends PageObject {

    public static final Target APRENDER_FACIL = Target.the("seleccionar aprender facil").locatedBy("//*[@id=\"main-menu\"]/div[2]/ul[1]/li[3]/a");

    public static final Target LEGALES = Target.the("seleccionar legales").locatedBy("//body/div[@id='main-content']/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]");
    public static final Target FATCA = Target.the("seleccionar fatca").locatedBy("//body/div[@id='main-content']/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]");
    public static final Target TABLA = Target.the("validar tabla").locatedBy("//body/div[@id='main-content']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h3[3]");
    public static final Target PDF = Target.the("pdf").locatedBy("//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]");



}
