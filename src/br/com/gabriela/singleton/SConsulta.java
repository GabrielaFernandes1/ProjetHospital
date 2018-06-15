/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriela.singleton;

import br.com.gabriela.objeto.Consulta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SConsulta {
    private List<Consulta> consultas = new ArrayList();

    public List<Consulta> getConsultas() {
        return consultas;
    }
    
    
    
    private SConsulta() {
    }
    
    public static SConsulta getInstance() {
        return SConsultaHolder.INSTANCE;
    }
    
    private static class SConsultaHolder {

        private static final SConsulta INSTANCE = new SConsulta();
    }
}
