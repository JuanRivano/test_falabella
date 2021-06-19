package step;


import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.openFalabella.principalFalabellaPage;

public class restablecerContrasenaStep {
    private principalFalabellaPage pPageFalabella = new principalFalabellaPage();

    @Given("^Ingreso a falabella$")
    public void restablecerContrasenaStep() {
        pPageFalabella.quitarMensaje();
    }

    @And("^Doy click opciones del usaurio$")
    public void doyClickOpcionesDelUsaurio() {
        pPageFalabella.clickAccionesUsusario();
    }

    @When("^Selecciono opcion Restablecer contraseña$")
    public void seleccionoOpcionRestablecerContraseña() {
        pPageFalabella.clicOpcionRestablecerContraseña();
    }


    @And("^Ingreso correo no registrado \"([^\"]*)\"$")
    public void ingresoCorreoNoRegistrado(String arg0) throws Throwable {
        pPageFalabella.ingresoCorreo(arg0);

    }

    @Then("^Se despliega mensaje de error esperado$")
    public void seDespliegaMensajeDeErrorEsperado() {
        pPageFalabella.clickContinuarValidarMensaje();
    }

    @And("^Presiono link ya tengo codigo verificador$")
    public void presionoLinkYaTengoCodigoVerificador() {
        pPageFalabella.presionoBtnYaTengoCodigoVerificador();
    }


    @And("^Ingreso rut que no cumple condiciones\"([^\"]*)\"$")
    public void ingresoRutQueNoCumpleCondiciones(String arg0) throws Throwable {
        pPageFalabella.ingresoContraseña(arg0);
    }

    @Then("^Se despliega alertas de clave fuera de formato$")
    public void seDespliegaAlertasDeClaveFueraDeFormato() {
        pPageFalabella.validadorDeNuevaClave("failure");
    }

    @And("^Ingreso contraseña que cumple condiciones\"([^\"]*)\"$")
    public void ingresoContrasenaQueCumpleCondiciones(String arg0) throws Throwable {
        pPageFalabella.ingresoContraseña(arg0);
    }

    @Then("^Se despliega alertas de clave con formato correcto$")
    public void seDespliegaAlertasDeClaveConFormatoCorrecto() {
        pPageFalabella.validadorDeNuevaClave("success");
    }


    @And("^Ingreso correo \"([^\"]*)\"$")
    public void ingresoCorreo(String arg0) throws Throwable {
        pPageFalabella.ingresoCorreo(arg0);
    }

    @Then("^Se despliega alerta de correo no valido$")
    public void seDespliegaAlertaDeCorreoNoValido() {
        pPageFalabella.validarMensajeCorreoNoValido();
    }

    @And("^Ingreso codigo verificador erroneo\"([^\"]*)\"$")
    public void ingresoCodigoVerificadorErroneo(String arg0) throws Throwable {
        pPageFalabella.codigoVerioficador(arg0);
    }

    @And("^Presiono crear nueva clave$")
    public void presionoCrearNuevaClave() {
        pPageFalabella.presionarBotonCrear();
    }

    @Then("^Se despliega alerta de codigo verificacion erroneo$")
    public void seDespliegaAlertaDeCodigoVerificacionErroneo() {
        pPageFalabella.validarMensajeErrorCodigoVerificacion();
    }

    @After
    public void afterScenario() {
        pPageFalabella.closeNavegador();
    }
}
