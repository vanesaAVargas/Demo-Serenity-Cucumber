package com.swag.pe.steps.login;

import com.swag.pe.pages.login.LoginPage;
import net.serenitybdd.annotations.Step;

public class LoginStep extends LoginPage {
   @Step("Ingresar usuario")
    public void typeUsername(String username) {
        enterUserName(username);
    }
    @Step("Ingresar contrasena")
    public void typePassword(String password) {
        enterPassword(password);
    }
    @Step("Click en el boton login")
    public void clickLogin() {
        clickLoginButton();
    }



}
