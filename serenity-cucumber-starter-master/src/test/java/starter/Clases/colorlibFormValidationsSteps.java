package starter.Clases;

import net.thucydides.core.annotations.Step;
import starter.objectos.ColorlibFormValidationPage;

import java.util.List;

public class colorlibFormValidationsSteps {

    ColorlibFormValidationPage colorlibFormValidationPage;

    @Step
    public void diligenciar_popup_datos_tabla(List<List<String>> data, int id) {

        colorlibFormValidationPage.required(data.get(id).get(0).trim());
        colorlibFormValidationPage.selectSports(data.get(id).get(1).trim());
        colorlibFormValidationPage.selectSport2(data.get(id).get(2).trim());
        colorlibFormValidationPage.url(data.get(id).get(3).trim());
        colorlibFormValidationPage.cEmail(data.get(id).get(4).trim());
        colorlibFormValidationPage.cPassword(data.get(id).get(5).trim());
        colorlibFormValidationPage.cComfirm_password(data.get(id).get(6).trim());
        colorlibFormValidationPage.cMinimun_Size(data.get(id).get(7).trim());
        colorlibFormValidationPage.cMaximum_Size(data.get(id).get(8).trim());
        colorlibFormValidationPage.cDato_Number(data.get(id).get(9).trim());
        colorlibFormValidationPage.cDato_IP(data.get(id).get(10).trim());
        colorlibFormValidationPage.cDato_Date(data.get(id).get(11).trim());
        colorlibFormValidationPage.cDato_DateEarlier(data.get(id).get(12).trim());
        colorlibFormValidationPage.btnValidar();

    }

    @Step
    public void verificar_ingreso_datos_formulario_exitoso(){
        colorlibFormValidationPage.form_sin_errores();
    }

    @Step
    public void verificar_ingreso_datos_formulario_con_errores(){
        colorlibFormValidationPage.form_con_errores();
    }
}
