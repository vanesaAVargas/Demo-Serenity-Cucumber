package com.swag.pe.pages.login;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
    @FindBy(id="user-name")
    protected WebElementFacade txt_username;
   @FindBy(id="password")
    protected WebElementFacade txt_password;
   @FindBy(id="login-button")
   protected WebElementFacade btn_login;


   public void enterUserName(String username){
       txt_username.sendKeys(username);
   }
    public void enterPassword(String password){
        txt_password.sendKeys(password);
    }
    public void clickLoginButton(){
        btn_login.click();

    }



}
