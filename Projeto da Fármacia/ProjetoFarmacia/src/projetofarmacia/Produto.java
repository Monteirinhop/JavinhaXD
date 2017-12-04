/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofarmacia;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author gustavo
 */
@Entity
@Table(name = "Produto", catalog = "ProjetoFarmacia", schema = "")
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p")
    , @NamedQuery(name = "Produto.findByCodRemedio", query = "SELECT p FROM Produto p WHERE p.codRemedio = :codRemedio")
    , @NamedQuery(name = "Produto.findByValidade", query = "SELECT p FROM Produto p WHERE p.validade = :validade")
    , @NamedQuery(name = "Produto.findByNome", query = "SELECT p FROM Produto p WHERE p.nome = :nome")
    , @NamedQuery(name = "Produto.findByMarca", query = "SELECT p FROM Produto p WHERE p.marca = :marca")
    , @NamedQuery(name = "Produto.findByQuantidade", query = "SELECT p FROM Produto p WHERE p.quantidade = :quantidade")})
public class Produto implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Cod_Remedio")
    private Integer codRemedio;
    @Basic(optional = false)
    @Column(name = "Validade")
    private String validade;
    @Basic(optional = false)
    @Column(name = "Nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "Marca")
    private String marca;
    @Basic(optional = false)
    @Column(name = "Quantidade")
    private String quantidade;

    public Produto() {
    }

    public Produto(Integer codRemedio) {
        this.codRemedio = codRemedio;
    }

    public Produto(Integer codRemedio, String validade, String nome, String marca, String quantidade) {
        this.codRemedio = codRemedio;
        this.validade = validade;
        this.nome = nome;
        this.marca = marca;
        this.quantidade = quantidade;
    }

    public Integer getCodRemedio() {
        return codRemedio;
    }

    public void setCodRemedio(Integer codRemedio) {
        Integer oldCodRemedio = this.codRemedio;
        this.codRemedio = codRemedio;
        changeSupport.firePropertyChange("codRemedio", oldCodRemedio, codRemedio);
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        String oldValidade = this.validade;
        this.validade = validade;
        changeSupport.firePropertyChange("validade", oldValidade, validade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        String oldMarca = this.marca;
        this.marca = marca;
        changeSupport.firePropertyChange("marca", oldMarca, marca);
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        String oldQuantidade = this.quantidade;
        this.quantidade = quantidade;
        changeSupport.firePropertyChange("quantidade", oldQuantidade, quantidade);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codRemedio != null ? codRemedio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.codRemedio == null && other.codRemedio != null) || (this.codRemedio != null && !this.codRemedio.equals(other.codRemedio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projetofarmacia.Produto[ codRemedio=" + codRemedio + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
