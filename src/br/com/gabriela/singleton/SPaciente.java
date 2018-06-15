/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriela.singleton;

import br.com.gabriela.objeto.Paciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SPaciente {
    private List<Paciente> pacientes = new ArrayList();

    public List<Paciente> getPacientes() {
        return pacientes;
    }
    
    
    
    private SPaciente() {
    }
    
    public static SPaciente getInstance() {
        return SPacienteHolder.INSTANCE;
    }
    
    private static class SPacienteHolder {

        private static final SPaciente INSTANCE = new SPaciente();
    }
}
