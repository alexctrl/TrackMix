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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "agregado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agregado.findAll", query = "SELECT a FROM Agregado a"),
    @NamedQuery(name = "Agregado.findById", query = "SELECT a FROM Agregado a WHERE a.id = :id"),
    @NamedQuery(name = "Agregado.findByNome", query = "SELECT a FROM Agregado a WHERE a.nome = :nome"),
    @NamedQuery(name = "Agregado.findByPreco", query = "SELECT a FROM Agregado a WHERE a.preco = :preco"),
    @NamedQuery(name = "Agregado.findByEstoque", query = "SELECT a FROM Agregado a WHERE a.estoque = :estoque")})
public class Agregado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Column(name = "preco")
    private float preco;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estoque")
    private int estoque;
    @JoinColumn(name = "agregado_tipo_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AgregadoTipo agregadoTipoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agregado")
    private Collection<TracoAgregado> tracoAgregadoCollection;

    public Agregado() {
    }

    public Agregado(Integer id) {
        this.id = id;
    }

    public Agregado(Integer id, String nome, float preco, int estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public AgregadoTipo getAgregadoTipoId() {
        return agregadoTipoId;
    }

    public void setAgregadoTipoId(AgregadoTipo agregadoTipoId) {
        this.agregadoTipoId = agregadoTipoId;
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
        if (!(object instanceof Agregado)) {
            return false;
        }
        Agregado other = (Agregado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Agregado[ id=" + id + " ]";
    }
    
}
