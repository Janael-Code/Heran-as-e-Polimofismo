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
public class Imovel {
    float preco;
 String Endereco;
   
    public void getPreco(float preco){
    this.preco = preco;
    }
    public float setPreco(){
    return this.preco;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
}
