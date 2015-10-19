/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alexandre Magno
 */
@Entity
@Table(name = "agregado_tipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AgregadoTipo.findAll", query = "SELECT a FROM AgregadoTipo a"),
    @NamedQuery(name = "AgregadoTipo.findById", query = "SELECT a FROM AgregadoTipo a WHERE a.id = :id"),
    @NamedQuery(name = "AgregadoTipo.findByTipo", query = "SELECT a FROM AgregadoTipo a WHERE a.tipo = :tipo")})
public class AgregadoTipo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Short id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "tipo")
    private String tipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agregadoTipoId")
    private Collection<Agregado> agregadoCollection;

    public AgregadoTipo() {
    }

    public AgregadoTipo(Short id) {
        this.id = id;
    }

    public AgregadoTipo(Short id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @XmlTransient
    public Collection<Agregado> getAgregadoCollection() {
        return agregadoCollection;
    }

    public void setAgregadoCollection(Collection<Agregado> agregadoCollection) {
        this.agregadoCollection = agregadoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgregadoTipo)) {
            return false;
        }
        AgregadoTipo other = (AgregadoTipo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.AgregadoTipo[ id=" + id + " ]";
    }
    
}
