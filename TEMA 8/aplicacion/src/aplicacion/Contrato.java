/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author Naia
 */
public class Contrato {
    private String tipoContrato;     

    public Contrato(){
    }
    public Contrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
   

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
}
