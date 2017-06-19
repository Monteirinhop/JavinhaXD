/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formdesenvolvimento;

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
@Table(name = "produtos", catalog = "sell", schema = "")
@NamedQueries({
    @NamedQuery(name = "Produtos.findAll", query = "SELECT p FROM Produtos p"),
    @NamedQuery(name = "Produtos.findById", query = "SELECT p FROM Produtos p WHERE p.id = :id"),
    @NamedQuery(name = "Produtos.findByDescricao", query = "SELECT p FROM Produtos p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "Produtos.findByFornecedor", query = "SELECT p FROM Produtos p WHERE p.fornecedor = :fornecedor"),
    @NamedQuery(name = "Produtos.findByValor", query = "SELECT p FROM Produtos p WHERE p.valor = :valor"),
    @NamedQuery(name = "Produtos.findByValorFinal", query = "SELECT p FROM Produtos p WHERE p.valorFinal = :valorFinal"),
    @NamedQuery(name = "Produtos.findByQtdEstoque", query = "SELECT p FROM Produtos p WHERE p.qtdEstoque = :qtdEstoque"),
    @NamedQuery(name = "Produtos.findByMarca", query = "SELECT p FROM Produtos p WHERE p.marca = :marca"),
    @NamedQuery(name = "Produtos.findByCategoria", query = "SELECT p FROM Produtos p WHERE p.categoria = :categoria")})
public class Produtos implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "fornecedor")
    private int fornecedor;
    @Basic(optional = false)
    @Column(name = "valor")
    private float valor;
    @Basic(optional = false)
    @Column(name = "valorFinal")
    private float valorFinal;
    @Basic(optional = false)
    @Column(name = "qtdEstoque")
    private int qtdEstoque;
    @Basic(optional = false)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @Column(name = "categoria")
    private String categoria;

    public Produtos() {
    }

    public Produtos(Integer id) {
        this.id = id;
    }

    public Produtos(Integer id, String descricao, int fornecedor, float valor, float valorFinal, int qtdEstoque, String marca, String categoria) {
        this.id = id;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.valor = valor;
        this.valorFinal = valorFinal;
        this.qtdEstoque = qtdEstoque;
        this.marca = marca;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public int getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(int fornecedor) {
        int oldFornecedor = this.fornecedor;
        this.fornecedor = fornecedor;
        changeSupport.firePropertyChange("fornecedor", oldFornecedor, fornecedor);
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        float oldValor = this.valor;
        this.valor = valor;
        changeSupport.firePropertyChange("valor", oldValor, valor);
    }

    public float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(float valorFinal) {
        float oldValorFinal = this.valorFinal;
        this.valorFinal = valorFinal;
        changeSupport.firePropertyChange("valorFinal", oldValorFinal, valorFinal);
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        int oldQtdEstoque = this.qtdEstoque;
        this.qtdEstoque = qtdEstoque;
        changeSupport.firePropertyChange("qtdEstoque", oldQtdEstoque, qtdEstoque);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        String oldMarca = this.marca;
        this.marca = marca;
        changeSupport.firePropertyChange("marca", oldMarca, marca);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        String oldCategoria = this.categoria;
        this.categoria = categoria;
        changeSupport.firePropertyChange("categoria", oldCategoria, categoria);
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
        if (!(object instanceof Produtos)) {
            return false;
        }
        Produtos other = (Produtos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "formdesenvolvimento.Produtos[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
