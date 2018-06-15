/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriela.singleton;

import br.com.gabriela.objeto.Triagem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class STriagem {
    private List<Triagem> triagem = new ArrayList();

    public List<Triagem> getTriagem() {
        return triagem;
    }
    
        
    
    private STriagem() {
    }
    
    public static STriagem getInstance() {
        return STriagemHolder.INSTANCE;
    }
    
    private static class STriagemHolder {

        private static final STriagem INSTANCE = new STriagem();
    }
}
