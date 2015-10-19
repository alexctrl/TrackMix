/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.DespesasIdentificacaoequipamento;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alexandre Magno
 */
@Stateless
public class DespesasIdentificacaoequipamentoFacade extends AbstractFacade<DespesasIdentificacaoequipamento> {
    @PersistenceContext(unitName = "TrackMixPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DespesasIdentificacaoequipamentoFacade() {
        super(DespesasIdentificacaoequipamento.class);
    }
    
}
