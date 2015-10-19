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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alexandre Magno
 */
@Entity
@Table(name = "despesas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Despesas.findAll", query = "SELECT d FROM Despesas d"),
    @NamedQuery(name = "Despesas.findById", query = "SELECT d FROM Despesas d WHERE d.id = :id"),
    @NamedQuery(name = "Despesas.findByData", query = "SELECT d FROM Despesas d WHERE d.data = :data"),
    @NamedQuery(name = "Despesas.findByNota", query = "SELECT d FROM Despesas d WHERE d.nota = :nota"),
    @NamedQuery(name = "Despesas.findByValor", query = "SELECT d FROM Despesas d WHERE d.valor = :valor"),
    @NamedQuery(name = "Despesas.findByObservacao", query = "SELECT d FROM Despesas d WHERE d.observacao = :observacao")})
public class Despesas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @Size(max = 60)
    @Column(name = "nota")
    private String nota;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private float valor;
    @Size(max = 100)
    @Column(name = "observacao")
    private String observacao;
    @JoinColumn(name = "despesas_aplicacao_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private DespesasAplicacao despesasAplicacaoId;
    @JoinColumn(name = "despesas_area_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private DespesasArea despesasAreaId;
    @JoinColumn(name = "despesas_fornecedor_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private DespesasFornecedor despesasFornecedorId;
    @JoinColumn(name = "despesas_identificacaoEquipamento_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private DespesasIdentificacaoequipamento despesasidentificacaoEquipamentoid;

    public Despesas() {
    }

    public Despesas(Integer id) {
        this.id = id;
    }

    public Despesas(Integer id, Date data, float valor) {
        this.id = id;
        this.data = data;
        this.valor = valor;
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

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public DespesasAplicacao getDespesasAplicacaoId() {
        return despesasAplicacaoId;
    }

    public void setDespesasAplicacaoId(DespesasAplicacao despesasAplicacaoId) {
        this.despesasAplicacaoId = despesasAplicacaoId;
    }

    public DespesasArea getDespesasAreaId() {
        return despesasAreaId;
    }

    public void setDespesasAreaId(DespesasArea despesasAreaId) {
        this.despesasAreaId = despesasAreaId;
    }

    public DespesasFornecedor getDespesasFornecedorId() {
        return despesasFornecedorId;
    }

    public void setDespesasFornecedorId(DespesasFornecedor despesasFornecedorId) {
        this.despesasFornecedorId = despesasFornecedorId;
    }

    public DespesasIdentificacaoequipamento getDespesasidentificacaoEquipamentoid() {
        return despesasidentificacaoEquipamentoid;
    }

    public void setDespesasidentificacaoEquipamentoid(DespesasIdentificacaoequipamento despesasidentificacaoEquipamentoid) {
        this.despesasidentificacaoEquipamentoid = despesasidentificacaoEquipamentoid;
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
        if (!(object instanceof Despesas)) {
            return false;
        }
        Despesas other = (Despesas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Despesas[ id=" + id + " ]";
    }
    
}
