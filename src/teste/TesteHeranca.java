/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import modelo.Aluno;
import modelo.AlunoConvenio;
import modelo.AvaliacaoFisica;
import modelo.Convenio;
import modelo.Impressora;
import modelo.Pessoa;
import modelo.Plano;
import modelo.Professor;


/**
 *
 * @author vanessalagomachado
 */
public class TesteHeranca {
    public static void main(String[] args) {
        Professor p = new Professor();
        p.setNome("Juka");
        p.setCpf("123.123.123-67");
        p.setEspecializacao("Musculação");
        
        //System.out.println(p.exibirDados());
        
        Plano plano1 = new Plano();
        plano1.setNome("Básico");
        plano1.setDescricao("Acesso a musculação liberada");
        plano1.setValor(100);
        //System.out.println(plano1.exibirDados());
        
        
        
        Convenio c = new Convenio();
        c.setNome("IFSUL");
        c.setDesconto(5);
        
        AlunoConvenio a = new AlunoConvenio(c);
        a.setNome("Vivente");
        a.setMatricula("123");
        DateTimeFormatter formato = 
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        a.setDataNascimento(LocalDate.parse("10/01/2008", 
                formato));
        
         a.setDataMatricula(LocalDate.parse("10/04/2024", 
                formato));
        
        a.setPlano(plano1);
        
        
        
        AvaliacaoFisica av1 = new AvaliacaoFisica(a);
        a.adicionarAvaliacao(av1);
        av1.setProfessor(p);
        
        //System.out.println(a.exibirDados());
        
        //System.out.println("---- ");
        //System.out.println(av1.exibirDados());
        
        
//        Pessoa pes = new Pessoa("Teste");
//        System.out.println("---- ");
//        System.out.println(pes.exibirDados());
        Impressora.imprimirDados(p); // p é uma instância de Professor
        Impressora.imprimirDados(plano1); // plano1 é uma instância de Plano
        Impressora.imprimirDados(av1); // av1 é uma instância de AvaliacaoFisica
        Impressora.imprimirDados(a); // a é uma instância de Aluno
        
    }
}
