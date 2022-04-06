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
public class ImovelVelho extends Imovel {

    public float BaixPreco;

    public void getBaixPreco(float preco) {
        this.BaixPreco = preco;
    }

    public float setBaixPreco() {
        return this.BaixPreco;
    }

    public void DescPreco(float preco) {
        this.BaixPreco = preco * this.preco;
        System.out.println("Valor do imovel velho  :" + (this.BaixPreco + this.preco));
    }
}
