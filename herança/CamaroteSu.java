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
public class CamaroteSu extends Classevip{
    float TaxaAdicional;
   
    public void setTaxaAdicional(float valor){
        this.TaxaAdicional = valor;
    }
    public float getTaxaAdicional(){
        return this.TaxaAdicional;
    }  
    public float valorIngressoAdd(float valor){
        valor= this.ValorADD;
        float Adicional =(this.TaxaAdicional*this.Valoringresso)*2+this.Valoringresso;
    return Adicional;
    }
}   
