Feature: ya tengo codigo de verificación desde restablecer contraseña


  Scenario Outline: validador de contreseña invalida
    Given Ingreso a falabella
    And   Doy click opciones del usaurio
    When  Selecciono opcion Restablecer contraseña
    And   Presiono link ya tengo codigo verificador
    And   Ingreso rut que no cumple condiciones"<contrasena>"
    Then  Se despliega alertas de clave fuera de formato
    Examples:
      | contrasena |
      | $ #        |

  Scenario Outline: validador de contreseña valida
    Given Ingreso a falabella
    And   Doy click opciones del usaurio
    When  Selecciono opcion Restablecer contraseña
    And   Presiono link ya tengo codigo verificador
    And   Ingreso contraseña que cumple condiciones"<contrasena>"
    Then  Se despliega alertas de clave con formato correcto
    Examples:
      | contrasena |
      | Tc20marzo  |


  Scenario Outline: validador de correo no valido
    Given Ingreso a falabella
    And   Doy click opciones del usaurio
    When  Selecciono opcion Restablecer contraseña
    And   Presiono link ya tengo codigo verificador
    And   Ingreso correo "<correo>"
    Then  Se despliega alerta de correo no valido
    Examples:
      | correo         |
      | correonovalido |


  Scenario Outline: validador Código verificador incorrecto
    Given Ingreso a falabella
    And   Doy click opciones del usaurio
    When  Selecciono opcion Restablecer contraseña
    And   Presiono link ya tengo codigo verificador
    And   Ingreso correo "<correo>"
    And   Ingreso codigo verificador erroneo"<codigoVerificacion>"
    And   Ingreso contraseña que cumple condiciones"<contrasena>"
    And   Presiono crear nueva clave
    Then  Se despliega alerta de codigo verificacion erroneo
    Examples:
      | correo               | contrasena | codigoVerificacion |
      | juanrivano@gmail.com | Tc20marzo  | falso123           |


