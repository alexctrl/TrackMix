/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Alexandre Magno
 */
@Embeddable
public class TracoAgregadoPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "base_id")
    private int baseId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "agregado_id")
    private int agregadoId;

    public TracoAgregadoPK() {
    }

    public TracoAgregadoPK(int baseId, int agregadoId) {
        this.baseId = baseId;
        this.agregadoId = agregadoId;
    }

    public int getBaseId() {
        return baseId;
    }

    public void setBaseId(int baseId) {
        this.baseId = baseId;
    }

    public int getAgregadoId() {
        return agregadoId;
    }

    public void setAgregadoId(int agregadoId) {
        this.agregadoId = agregadoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) baseId;
        hash += (int) agregadoId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TracoAgregadoPK)) {
            return false;
        }
        TracoAgregadoPK other = (TracoAgregadoPK) object;
        if (this.baseId != other.baseId) {
            return false;
        }
        if (this.agregadoId != other.agregadoId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TracoAgregadoPK[ baseId=" + baseId + ", agregadoId=" + agregadoId + " ]";
    }
    
}
