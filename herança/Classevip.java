/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herança;

/**
 *
 * @author janae
 */
public class Classevip extends Ingreso {

    public float ValorADD;

    public float getValorAdicional() {
        return this.ValorADD;
    }

    public void setValorAdicional(float AdicionalV) {
        this.ValorADD = AdicionalV;
    }

    public float valorIngressoVip(float valoringresso) {
        this.Valoringresso = valoringresso;
        return this.Valoringresso + (this.ValorADD * this.Valoringresso);
    }
}
