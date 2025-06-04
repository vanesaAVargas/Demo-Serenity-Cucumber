package com.swag.pe.utilities.website;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.thucydides.core.pages.PageObject;

public class WebSite {
    @Steps//ompartr para poder ser utilizada en funciones o metodos atravez de ello
    PageObject swag;

    @Step("Navegar al sitio web")
    public void navigateTo(String url){
        swag.setDefaultBaseUrl(url);//llamamos la variable de esta clase pom
        swag.open();

    }

}
