/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vanessalagomachado
 */
public class Professor extends Funcionario {

    private String especializacao;

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public String exibirDados() {
        String aux = super.exibirDados();
        aux += "\nEspecialização: "+especializacao;
        return aux;
    }

    @Override
    public double calculaSalarioMes() {
        return salario * 1.25;
    }
}
