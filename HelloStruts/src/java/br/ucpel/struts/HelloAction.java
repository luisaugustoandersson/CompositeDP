/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucpel.struts;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author vgsantoniazzi
 */
public class HelloAction extends ActionSupport {

    private String nomeUsuario;

    @Override
    public String execute() {
        return SUCCESS;
    }

    /**
     * @return the nomeUsuario
     */
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    /**
     * @param nomeUsuario the nomeUsuario to set
     */
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
}