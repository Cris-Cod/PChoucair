package starter.objectos;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class ColorlibLoginPage extends PageObject {

    //CampoUsuario
    public void CampoUsuario(){
        $(By.cssSelector("div.tab-pane [placeholder='Username']"));
    }


    public void CampoPassword(){
        $(By.cssSelector("div.tab-pane [placeholder='Password']"));
    }

    public void Boton(){
        $(By.xpath("//*[@id=\"login\"]/form/button"));
    }

    public void tituloHome(){
        $(By.xpath("//h1"));
    }

    public void IngresarDatos(String strUsuario, String strPass){
        $(By.cssSelector("div.tab-pane [placeholder='Username']")).type(strUsuario);
        $(By.cssSelector("div.tab-pane [placeholder='Password']")).type(strPass);
        $(By.xpath("//*[@id=\"login\"]/form/button")).click();
    }

    public void VerificaHome(){
        String labelv = "Bootstrap-Admin-Template";
        String  strMensaje = $(By.xpath("//h1")).getText();
        Assert.assertEquals("El elemento no se encuentra en la pagina",labelv,strMensaje);

    }
}
