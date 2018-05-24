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
public class Enfermeira extends Pessoa{
    private int cofen;
    private String setor;

    public Enfermeira(String nome, Date dataNascimento, String cpf, String rg, String endereco, String telefone, String estadoCivil, char sexo) {
        super(nome, dataNascimento, cpf, rg, endereco, telefone, estadoCivil, sexo);
    }

    public int getCofen() {
        return cofen;
    }

    public void setCofen(int cofen) {
        this.cofen = cofen;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
   
}
