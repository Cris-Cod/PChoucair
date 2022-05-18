@Regresion
Feature: Formulario Popup Validation

  @CasoExitoso
  Scenario: Diligenciamiento exitoso del formulario Popup Validation,
    no se presenta ningún mensaje de validación
    Given Autentico en colorlib con usuario "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms validation
    When Diligencio Formulario Popup Validation
      |Required|Select|Multiple Select|Url                  |E-mail         |Password|Confirm Password|Minimum field size (6)|Maximum field size, optional|Number|    IP     |Date      |Date Earlier|
      |Valor1  | Golf |    Tennis     |http://www.valor1.com|valor@gmail.com| valor1 |     valor1     |        123456        |           123456           | 99.99|200.200.5.4|2021-05-22|2012/09/12  |
     Then Verifico ingreso exitoso


  @CasoAlterno
  Scenario: Diligenciamiento con errores del formulario Popup Validation,
            Se presenta Globo informativo indicando error en el diligenciamineto de alguno de los campos.

    Given Autentico en colorlib con usuario "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms validation
    When Diligencio Formulario Popup Validation
      |Required|Select|Multiple Select|Url                  |E-mail         |Password|Confirm Password|Minimum field size (6)|Maximum field size, optional|Number|    IP     |Date      |Date Earlier|
      | Valor1 | Golf |    Tennis     |http://www.valor1.com|valor@gmail.com| valor1 |     valor1     |        123456        |           123456           | 99.99|200.200.5.4|2021-05-22|2012/09/12  |
    Then Verificar que se presente Globo Informativo de validacion