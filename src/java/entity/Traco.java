/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alexandre Magno
 */
@Entity
@Table(name = "traco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Traco.findAll", query = "SELECT t FROM Traco t"),
    @NamedQuery(name = "Traco.findById", query = "SELECT t FROM Traco t WHERE t.id = :id"),
    @NamedQuery(name = "Traco.findByData", query = "SELECT t FROM Traco t WHERE t.data = :data"),
    @NamedQuery(name = "Traco.findByFck", query = "SELECT t FROM Traco t WHERE t.fck = :fck"),
    @NamedQuery(name = "Traco.findBySlump", query = "SELECT t FROM Traco t WHERE t.slump = :slump"),
    @NamedQuery(name = "Traco.findByAguaCentral", query = "SELECT t FROM Traco t WHERE t.aguaCentral = :aguaCentral")})
public class Traco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fck")
    private float fck;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "slump")
    private String slump;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aguaCentral")
    private float aguaCentral;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "baseId")
    private Collection<Venda> vendaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "traco")
    private Collection<TracoAgregado> tracoAgregadoCollection;

    public Traco() {
    }

    public Traco(Integer id) {
        this.id = id;
    }

    public Traco(Integer id, Date data, float fck, String slump, float aguaCentral) {
        this.id = id;
        this.data = data;
        this.fck = fck;
        this.slump = slump;
        this.aguaCentral = aguaCentral;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getFck() {
        return fck;
    }

    public void setFck(float fck) {
        this.fck = fck;
    }

    public String getSlump() {
        return slump;
    }

    public void setSlump(String slump) {
        this.slump = slump;
    }

    public float getAguaCentral() {
        return aguaCentral;
    }

    public void setAguaCentral(float aguaCentral) {
        this.aguaCentral = aguaCentral;
    }

    @XmlTransient
    public Collection<Venda> getVendaCollection() {
        return vendaCollection;
    }

    public void setVendaCollection(Collection<Venda> vendaCollection) {
        this.vendaCollection = vendaCollection;
    }

    @XmlTransient
    public Collection<TracoAgregado> getTracoAgregadoCollection() {
        return tracoAgregadoCollection;
    }

    public void setTracoAgregadoCollection(Collection<TracoAgregado> tracoAgregadoCollection) {
        this.tracoAgregadoCollection = tracoAgregadoCollection;
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
        if (!(object instanceof Traco)) {
            return false;
        }
        Traco other = (Traco) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Traco[ id=" + id + " ]";
    }
    
}
