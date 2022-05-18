package starter.objectos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;


@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class ColorlibFormValidationPage extends PageObject {

    @FindBy(id = "req")
    public WebElementFacade txtRequired;

    @FindBy(id = "sport")
    public WebElementFacade selectSport;

    @FindBy(id = "sport2")
    public WebElementFacade selectSport2;

    @FindBy(id = "email1")
    public WebElementFacade email;

    @FindBy(id = "url1")
    public WebElementFacade url;

    @FindBy(id = "pass1")
    public WebElementFacade password;

    @FindBy(id = "pass2")
    public WebElementFacade confirm_password;

    @FindBy(id = "minsize1")
    public WebElementFacade minimun_size;

    @FindBy(id = "maxsize1")
    public WebElementFacade maximun_size;

    @FindBy(id = "number2")
    public WebElementFacade dato_number;

    @FindBy(id = "ip")
    public WebElementFacade dato_ip;

    @FindBy(id = "date3")
    public WebElementFacade dato_date;

    @FindBy(id = "past")
    public WebElementFacade dato_dateEailer;

    @FindBy(xpath = "//*[@id=\"popup-validation\"]/div[14]/input")
    public WebElementFacade btnValidate;

    @FindBy(xpath = "(//DIV[@class='formErrorContent'])[1]")
    public WebElementFacade globoInformativo;


    public void required(String datoPrueba){
        txtRequired.click();
        txtRequired.clear();
        txtRequired.sendKeys(datoPrueba);
    }

    public void selectSports(String datoPrueba){
        selectSport.click();
        selectSport.selectByVisibleText(datoPrueba);
    }

    public void selectSport2(String datoPrueba){
        selectSport2.click();
        selectSport2.selectByVisibleText(datoPrueba);
    }

    public void url(String datoPrueba){
        url.click();
        url.clear();
        url.sendKeys(datoPrueba);
    }

    public void cEmail(String datoPrueba){
        email.click();
        email.clear();
        email.sendKeys(datoPrueba);
    }

    public void cPassword(String datoPrueba){
        password.click();
        password.clear();
        password.sendKeys(datoPrueba);
    }

    public void cComfirm_password(String datoPrueba){
        confirm_password.click();
        confirm_password.clear();
        confirm_password.sendKeys(datoPrueba);
    }

    public void cMinimun_Size(String datoPrueba){
        minimun_size.click();
        minimun_size.clear();
        minimun_size.sendKeys(datoPrueba);
    }

    public void cMaximum_Size(String datoPrueba) {
        maximun_size.click();
        maximun_size.clear();
        maximun_size.sendKeys(datoPrueba);
    }

    public void cDato_Number(String datoPrueba) {
        dato_number.click();
        dato_number.clear();
        dato_number.sendKeys(datoPrueba);
    }

    public void cDato_IP(String datoPrueba) {
        dato_ip.click();
        dato_ip.clear();
        dato_ip.sendKeys(datoPrueba);
    }

    public void cDato_Date(String datoPrueba) {
        dato_date.click();
        dato_date.clear();
        dato_date.sendKeys(datoPrueba);
    }

    public void cDato_DateEarlier(String datoPrueba) {
        dato_dateEailer.click();
        dato_dateEailer.clear();
        dato_dateEailer.sendKeys(datoPrueba);
    }

    public void btnValidar() {
        btnValidate.click();
    }

    public void form_sin_errores(){
        Assert.assertFalse(globoInformativo.isCurrentlyVisible());
    }

    public void form_con_errores(){
        Assert.assertTrue(globoInformativo.isCurrentlyVisible());
    }

}
