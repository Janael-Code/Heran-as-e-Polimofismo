/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade2Herança;

/**
 *
 * @author janae
 */
public class ImovelZero extends Imovel {

    public float AdicionarPreco;

    public float setAdicionarPreco() {
        return this.AdicionarPreco;
    }

    public void getAdicionarPreco(float preco) {
        this.AdicionarPreco = preco;
    }

    public void imprPreco(float preco) {
        this.AdicionarPreco = preco * this.preco;
        System.out.println("Valor :" + (this.AdicionarPreco + this.preco));
    }
}
