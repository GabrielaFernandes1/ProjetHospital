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
public class Consulta {
   private Triagem triagem;
   private Medico medico;
   private List <String> medicamentos;
   private String diagnostico;
   private Boolean atestado;
   private int codigoDiagnostico;

    @Override
    public String toString() {
        return "Consulta{" + "triagem=" + triagem + ", medico=" + medico + ", medicamentos=" + medicamentos + ", diagnostico=" + diagnostico + ", atestado=" + atestado + ", codigoDiagnostico=" + codigoDiagnostico + '}';
    }

    public Consulta(Triagem triagem, Medico medico, List<String> medicamentos, String diagnostico, Boolean atestado, int codigoDiagnostico) {
        this.triagem = triagem;
        this.medico = medico;
        this.medicamentos = medicamentos;
        this.diagnostico = diagnostico;
        this.atestado = atestado;
        this.codigoDiagnostico = codigoDiagnostico;
    }
   
   

    public Triagem getTriagem() {
        return triagem;
    }

    public void setTriagem(Triagem triagem) {
        this.triagem = triagem;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public List<String> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<String> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Boolean getAtestado() {
        return atestado;
    }

    public void setAtestado(Boolean atestado) {
        this.atestado = atestado;
    }

    public int getCodigoDiagnostico() {
        return codigoDiagnostico;
    }

    public void setCodigoDiagnostico(int codigoDiagnostico) {
        this.codigoDiagnostico = codigoDiagnostico;
    }
   
   
   
}
