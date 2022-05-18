package starter.objectos;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class ColorlibMenuPage extends PageObject {

    public void menuFormValidation(){
        $(By.cssSelector("a.dropdown-toggle")).click();
        $(By.cssSelector("ul.dropdown-menu a[href='form-validation.html']")).click();
        String text = "Popup Validation";
        String strMensaje = $(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div/header/h5")).getText();
        Assert.assertEquals("El elemento no se encuentra en la pagina",text,strMensaje);

    }
}
