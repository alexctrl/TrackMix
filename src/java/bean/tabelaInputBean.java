/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entity.Agregado;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import session.AgregadoFacade;

/**
 *
 * @author Alexandre Magno
 */
@Named(value = "tabelaInputBean")
@Dependent
public class tabelaInputBean {
    @EJB
    
    private AgregadoFacade agregadoFacade;
    DataModel<Agregado> modelAgregado;

    
    
    public DataModel<Agregado> getModelAgregado() {
        modelAgregado = new ListDataModel(agregadoFacade.findAll());
        return modelAgregado;
    }

    public void setModelAgregado(DataModel<Agregado> modelAgregados) {
        this.modelAgregado = modelAgregados;
    }
    
    
    
}
