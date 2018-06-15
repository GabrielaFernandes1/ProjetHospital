/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriela.singleton;

import br.com.gabriela.objeto.Medico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SMedico {
    private List<Medico> medicos = new ArrayList();

    public List<Medico> getMedicos() {
        return medicos;
    }
    
    
    private SMedico() {
    }
    
    public static SMedico getInstance() {
        return SMedicoHolder.INSTANCE;
    }
    
    private static class SMedicoHolder {

        private static final SMedico INSTANCE = new SMedico();
    }
}
