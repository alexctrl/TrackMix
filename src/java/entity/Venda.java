/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alexandre Magno
 */
@Entity
@Table(name = "venda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venda.findAll", query = "SELECT v FROM Venda v"),
    @NamedQuery(name = "Venda.findById", query = "SELECT v FROM Venda v WHERE v.id = :id"),
    @NamedQuery(name = "Venda.findByData", query = "SELECT v FROM Venda v WHERE v.data = :data")})
public class Venda implements Serializable {
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
    @JoinColumn(name = "base_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Traco baseId;
    @JoinColumn(name = "betoneira_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Betoneira betoneiraId;
    @JoinColumn(name = "bomba_id", referencedColumnName = "id")
    @ManyToOne
    private Bomba bombaId;

    public Venda() {
    }

    public Venda(Integer id) {
        this.id = id;
    }

    public Venda(Integer id, Date data) {
        this.id = id;
        this.data = data;
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

    public Traco getBaseId() {
        return baseId;
    }

    public void setBaseId(Traco baseId) {
        this.baseId = baseId;
    }

    public Betoneira getBetoneiraId() {
        return betoneiraId;
    }

    public void setBetoneiraId(Betoneira betoneiraId) {
        this.betoneiraId = betoneiraId;
    }

    public Bomba getBombaId() {
        return bombaId;
    }

    public void setBombaId(Bomba bombaId) {
        this.bombaId = bombaId;
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
        if (!(object instanceof Venda)) {
            return false;
        }
        Venda other = (Venda) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Venda[ id=" + id + " ]";
    }
    
}
