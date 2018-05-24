/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriela.objeto;

import java.util.List;

/**
 *
 * @author SATC
 */
public class Triagem {
   private Enfermeira enfermeira; 
   private Paciente paciente;
   private String pressao;
   private float temperatura;
   private String sintomas;
   private List<String> alergias;
   private float peso;
   private float altura;
   private float imc;
   private Boolean febre;

    public Triagem(Enfermeira enfermeira, Paciente paciente, String pressao, float temperatura, String sintomas, List<String> alergias, float peso, float altura) {
        this.enfermeira = enfermeira;
        this.paciente = paciente;
        this.pressao = pressao;
        this.temperatura = temperatura;
        this.sintomas = sintomas;
        this.alergias = alergias;
        this.peso = peso;
        this.altura = altura;
    }
   

    public Enfermeira getEnfermeira() {
        return enfermeira;
    }

    public void setEnfermeira(Enfermeira enfermeira) {
        this.enfermeira = enfermeira;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getPressao() {
        return pressao;
    }

    public void setPressao(String pressao) {
        this.pressao = pressao;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public List<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<String> alergias) {
        this.alergias = alergias;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public Boolean getFebre() {
        return febre;
    }

    public void setFebre(Boolean febre) {
        this.febre = febre;
    }
   
   
}