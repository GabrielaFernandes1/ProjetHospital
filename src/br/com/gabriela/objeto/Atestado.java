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
public class Atestado {
   private Date dataInicioAtestado; 
   private Date dataFimAtestado;
   private Consulta consulta;
   private int quantidadDias;

    @Override
    public String toString() {
        return "Atestado{" + "dataInicioAtestado=" + dataInicioAtestado + ", dataFimAtestado=" + dataFimAtestado + ", consulta=" + consulta + ", quantidadDias=" + quantidadDias + '}';
    }
   
   

    public Atestado(Date dataInicioAtestado, Date dataFimAtestado, Consulta consulta, int quantidadDias) {
        this.dataInicioAtestado = dataInicioAtestado;
        this.dataFimAtestado = dataFimAtestado;
        this.consulta = consulta;
        this.quantidadDias = quantidadDias;
    }
   
   

    public Date getDataInicioAtestado() {
        return dataInicioAtestado;
    }

    public void setDataInicioAtestado(Date dataInicioAtestado) {
        this.dataInicioAtestado = dataInicioAtestado;
    }

    public Date getDataFimAtestado() {
        return dataFimAtestado;
    }

    public void setDataFimAtestado(Date dataFimAtestado) {
        this.dataFimAtestado = dataFimAtestado;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public int getQuantidadDias() {
        return quantidadDias;
    }

    public void setQuantidadDias(int quantidadDias) {
        this.quantidadDias = quantidadDias;
    }
   
   
}
