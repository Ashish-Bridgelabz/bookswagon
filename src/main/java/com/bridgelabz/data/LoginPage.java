package com.bridgelabz.data;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

    WebDriver driver;
    public LoginPage(WebDriver driver){

        this.driver = driver;
    }


    @FindBy(how = How.XPATH,using = "*[@id=\"ctl00_divLogin\"]/ul/li[1]/a")
    WebElement clickLogin;
    

    @FindBy(how = How.NAME, using="ctl00$phBody$SignIn$txtEmail")
    WebElement userName;

    @FindBy(how = How.NAME, using = "ctl00$phBody$SignIn$txtPassword")
    WebElement userPassword;

    @FindBy(how = How.NAME,using = "ctl00$phBody$SignIn$btnLogin")
    WebElement login;

    public void clickLoginButton(){

        clickLogin.click();
    }

    public void setUserName(String strUserName){

        userName.sendKeys(strUserName);
    }

    public void setPassword(String strPassword){
        userPassword.sendKeys(strPassword);

    }
    public void clickLogin(){

        login.click();

    }


}



