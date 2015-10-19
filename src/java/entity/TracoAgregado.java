/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alexandre Magno
 */
@Entity
@Table(name = "traco_agregado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TracoAgregado.findAll", query = "SELECT t FROM TracoAgregado t"),
    @NamedQuery(name = "TracoAgregado.findByBaseId", query = "SELECT t FROM TracoAgregado t WHERE t.tracoAgregadoPK.baseId = :baseId"),
    @NamedQuery(name = "TracoAgregado.findByAgregadoId", query = "SELECT t FROM TracoAgregado t WHERE t.tracoAgregadoPK.agregadoId = :agregadoId"),
    @NamedQuery(name = "TracoAgregado.findByQuantidade", query = "SELECT t FROM TracoAgregado t WHERE t.quantidade = :quantidade")})
public class TracoAgregado implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TracoAgregadoPK tracoAgregadoPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantidade")
    private float quantidade;
    @JoinColumn(name = "agregado_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Agregado agregado;
    @JoinColumn(name = "base_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Traco traco;

    public TracoAgregado() {
    }

    public TracoAgregado(TracoAgregadoPK tracoAgregadoPK) {
        this.tracoAgregadoPK = tracoAgregadoPK;
    }

    public TracoAgregado(TracoAgregadoPK tracoAgregadoPK, float quantidade) {
        this.tracoAgregadoPK = tracoAgregadoPK;
        this.quantidade = quantidade;
    }

    public TracoAgregado(int baseId, int agregadoId) {
        this.tracoAgregadoPK = new TracoAgregadoPK(baseId, agregadoId);
    }

    public TracoAgregadoPK getTracoAgregadoPK() {
        return tracoAgregadoPK;
    }

    public void setTracoAgregadoPK(TracoAgregadoPK tracoAgregadoPK) {
        this.tracoAgregadoPK = tracoAgregadoPK;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public Agregado getAgregado() {
        return agregado;
    }

    public void setAgregado(Agregado agregado) {
        this.agregado = agregado;
    }

    public Traco getTraco() {
        return traco;
    }

    public void setTraco(Traco traco) {
        this.traco = traco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tracoAgregadoPK != null ? tracoAgregadoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TracoAgregado)) {
            return false;
        }
        TracoAgregado other = (TracoAgregado) object;
        if ((this.tracoAgregadoPK == null && other.tracoAgregadoPK != null) || (this.tracoAgregadoPK != null && !this.tracoAgregadoPK.equals(other.tracoAgregadoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TracoAgregado[ tracoAgregadoPK=" + tracoAgregadoPK + " ]";
    }
    
}
