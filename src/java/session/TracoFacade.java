/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Traco;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alexandre Magno
 */
@Stateless
public class TracoFacade extends AbstractFacade<Traco> {
    @PersistenceContext(unitName = "TrackMixPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TracoFacade() {
        super(Traco.class);
    }
    
}
