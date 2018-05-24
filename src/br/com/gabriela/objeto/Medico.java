/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriela.objeto;

import java.util.Date;

/**
 *
 * @author SATC
 */
public class Medico extends Pessoa{
   private int crm;
   private String especialidade;
   private String setor;

    public Medico(String nome, Date dataNascimento, String cpf, String rg, String endereco, String telefone, String estadoCivil, char sexo) {
        super(nome, dataNascimento, cpf, rg, endereco, telefone, estadoCivil, sexo);
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    
    
}
