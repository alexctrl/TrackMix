/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entity.Agregado;
import entity.TracoAgregado;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import session.AgregadoFacade;
import session.TracoAgregadoFacade;



/**
 *
 * @author Alexandre Magno
 */
@Named(value = "novoTracoBean")
@ViewScoped
public class novoTracoBean implements Serializable{
    @EJB
    
    private AgregadoFacade agregadoFacade;
    private TracoAgregadoFacade tracoAgregadoFacade;
    List<Agregado> listaAgregado;
    DataModel<TracoAgregado> modelTracoAgregado;
    List<TracoAgregado> listaTracoAgregado;
    int SelectedAgregado = 1;
    String quantidade = "0";

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    @PostConstruct
    public void init(){
        listaAgregado = agregadoFacade.findAll();
        listaTracoAgregado = new ArrayList();
        
    }
    
    public void addAgregado(){
        if (!quantidade.isEmpty()){
            TracoAgregado temp = new TracoAgregado();
            temp.setQuantidade(Integer.parseInt(quantidade));
            System.out.println("" + quantidade);
            temp.setAgregado(agregadoFacade.find(SelectedAgregado));
            listaTracoAgregado.add(temp);
            modelTracoAgregado = new ListDataModel(listaTracoAgregado);
        }
    }
    
    public void delAgregado(){
        listaTracoAgregado.remove(modelTracoAgregado.getRowIndex());
        modelTracoAgregado = (DataModel<TracoAgregado>) listaTracoAgregado;
    }

    public int getSelectedAgregado() {
        return SelectedAgregado;
    }

    public void setSelectedAgregado(int SelectedAgregado) {
        this.SelectedAgregado = SelectedAgregado;
    }
    
    public DataModel<TracoAgregado> getModelTracoAgregado(){
        return modelTracoAgregado;
    }

    public void setModelTracoAgregado(DataModel<TracoAgregado> modelTracoAgregado) {
        this.modelTracoAgregado = modelTracoAgregado;
    }

    public List<Agregado> getListaAgregado() {
        return listaAgregado;
    }

    public void setListaAgregado(List<Agregado> listaAgregado) {
        this.listaAgregado = listaAgregado;
    }
    
    
    
    

    
    
    
}
