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
public class Ingreso {

    


        public float Valoringresso = 50;

        public float getValorIngresso() {
            return this.Valoringresso;
        }

        public void setValoringresso(float valorIn) {
            this.Valoringresso = valorIn;
        }

        public void imprimeValor(float valor) {
            valor = this.Valoringresso;
            
            System.out.printf("Valor do Igresso  :" + valor);
        }
}
        

