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
public class Paciente extends Pessoa {

   private int id;
   private int numeroSus;
   private Pessoa responsavel;
  
   

    public Paciente(String nome, Date dataNascimento, String cpf, String rg, String endereco, String telefone, String estadoCivil, char sexo) {
        super(nome, dataNascimento, cpf, rg, endereco, telefone, estadoCivil, sexo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroSus() {
        return numeroSus;
    }

    public void setNumeroSus(int numeroSus) {
        this.numeroSus = numeroSus;
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }
    
    
   
}
