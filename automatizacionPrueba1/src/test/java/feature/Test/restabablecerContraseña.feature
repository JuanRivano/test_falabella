Feature: restablecer contraseña en modulo principal Falabella

  Scenario Outline: Validar el restablecimiento clave cliente correo no valido
    Given Ingreso a falabella
    And   Doy click opciones del usaurio
    When  Selecciono opcion Restablecer contraseña
    And   Ingreso correo no registrado "<correo>"
    Then  Se despliega mensaje de error esperado
    Examples:
      | correo                |
      | juanrivanos@gmail.com |


