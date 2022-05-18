package starter.Clases;

import net.thucydides.core.annotations.Step;
import starter.objectos.ColorlibLoginPage;
import starter.objectos.ColorlibMenuPage;

public class PopupValidationSteps {

    ColorlibLoginPage colorlibLoginPage;
    ColorlibMenuPage colorlibMenuPage;

    @Step
    public void login_colorlib(String strUsuario, String strPass){
        colorlibLoginPage.open();
        colorlibLoginPage.IngresarDatos(strUsuario, strPass);
        colorlibLoginPage.VerificaHome();
    }

    @Step
    public void ingresar_form_validation(){
        colorlibMenuPage.menuFormValidation();
    }
}
