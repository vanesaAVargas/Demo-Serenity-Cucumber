package com.swag.pe.pages.product;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SelectProductsPage extends PageObject {
    @FindBy(xpath = "//button[@class='btn_primary btn_inventory']")
    protected List<WebElementFacade> products;
    @FindBy(xpath = "//*[local-name()='svg']//ancestor::a")
    protected WebElementFacade shoppingCartIcon;
}
