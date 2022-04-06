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
public class CamaroteInferior extends Classevip{
      String LocalIngresso;
     
    public String getLocalIngresso(){
      return this.LocalIngresso;
    }
    public void setLocalIngresso(String local){
        this.LocalIngresso = local;
    }
   
    public String asLocalizacao(){
        return this.LocalIngresso;
    }
    public void imprimeLocalizacao(String Local){
        Local = this.LocalIngresso;
        System.out.println("Local:"+ Local);
    }
}
