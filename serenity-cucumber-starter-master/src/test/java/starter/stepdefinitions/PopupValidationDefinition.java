package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import starter.Clases.PopupValidationSteps;
import starter.Clases.colorlibFormValidationsSteps;



import java.util.List;

public class PopupValidationDefinition {

    @Steps
    PopupValidationSteps popupValidationSteps;

    @Steps
    colorlibFormValidationsSteps colorlibFormValidationsSteps;


    @Given("Autentico en colorlib con usuario {string} y clave {string}")
    public void autentico_en_colorlib_con_usuario_y_clave(String Usuario, String Clave) {
        popupValidationSteps.login_colorlib(Usuario, Clave);
    }
    @Given("Ingreso a la funcionalidad Forms validation")
    public void ingreso_a_la_funcionalidad_forms_validation() {
        popupValidationSteps.ingresar_form_validation();
    }
    @When("Diligencio Formulario Popup Validation")
    public void diligencio_formulario_popup_validation(DataTable dtDatosForm) {
        List<List<String>> data = dtDatosForm.cells();

        for(int i=1; i<data.size(); i++){
            colorlibFormValidationsSteps.diligenciar_popup_datos_tabla(data, i);
        }
    }
    @Then("Verifico ingreso exitoso")
    public void verifico_ingreso_exitoso() {
        colorlibFormValidationsSteps.verificar_ingreso_datos_formulario_exitoso();
    }

    @Then("Verificar que se presente Globo Informativo de validacion")
    public void verificar_que_se_presente_globo_informativo_de_validacion() {
        colorlibFormValidationsSteps.verificar_ingreso_datos_formulario_con_errores();
    }


}
