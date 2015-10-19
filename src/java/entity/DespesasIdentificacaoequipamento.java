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
@Table(name = "despesas_identificacaoequipamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DespesasIdentificacaoequipamento.findAll", query = "SELECT d FROM DespesasIdentificacaoequipamento d"),
    @NamedQuery(name = "DespesasIdentificacaoequipamento.findById", query = "SELECT d FROM DespesasIdentificacaoequipamento d WHERE d.id = :id"),
    @NamedQuery(name = "DespesasIdentificacaoequipamento.findByIdentificacaoEquipamento", query = "SELECT d FROM DespesasIdentificacaoequipamento d WHERE d.identificacaoEquipamento = :identificacaoEquipamento")})
public class DespesasIdentificacaoequipamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Short id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "identificacaoEquipamento")
    private String identificacaoEquipamento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "despesasidentificacaoEquipamentoid")
    private Collection<Despesas> despesasCollection;

    public DespesasIdentificacaoequipamento() {
    }

    public DespesasIdentificacaoequipamento(Short id) {
        this.id = id;
    }

    public DespesasIdentificacaoequipamento(Short id, String identificacaoEquipamento) {
        this.id = id;
        this.identificacaoEquipamento = identificacaoEquipamento;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getIdentificacaoEquipamento() {
        return identificacaoEquipamento;
    }

    public void setIdentificacaoEquipamento(String identificacaoEquipamento) {
        this.identificacaoEquipamento = identificacaoEquipamento;
    }

    @XmlTransient
    public Collection<Despesas> getDespesasCollection() {
        return despesasCollection;
    }

    public void setDespesasCollection(Collection<Despesas> despesasCollection) {
        this.despesasCollection = despesasCollection;
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
        if (!(object instanceof DespesasIdentificacaoequipamento)) {
            return false;
        }
        DespesasIdentificacaoequipamento other = (DespesasIdentificacaoequipamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.DespesasIdentificacaoequipamento[ id=" + id + " ]";
    }
    
}
