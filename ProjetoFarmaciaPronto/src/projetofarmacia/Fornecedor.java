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
@Table(name = "Fornecedor", catalog = "ProjetoFarmacia", schema = "")
@NamedQueries({
    @NamedQuery(name = "Fornecedor_1.findAll", query = "SELECT f FROM Fornecedor_1 f")
    , @NamedQuery(name = "Fornecedor_1.findById", query = "SELECT f FROM Fornecedor_1 f WHERE f.id = :id")
    , @NamedQuery(name = "Fornecedor_1.findByCnpj", query = "SELECT f FROM Fornecedor_1 f WHERE f.cnpj = :cnpj")
    , @NamedQuery(name = "Fornecedor_1.findByEmail", query = "SELECT f FROM Fornecedor_1 f WHERE f.email = :email")
    , @NamedQuery(name = "Fornecedor_1.findByNome", query = "SELECT f FROM Fornecedor_1 f WHERE f.nome = :nome")
    , @NamedQuery(name = "Fornecedor_1.findByTelefone", query = "SELECT f FROM Fornecedor_1 f WHERE f.telefone = :telefone")
    , @NamedQuery(name = "Fornecedor_1.findByEndereco", query = "SELECT f FROM Fornecedor_1 f WHERE f.endereco = :endereco")})
public class Fornecedor implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "CNPJ")
    private String cnpj;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @Column(name = "Nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "Telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "Endereco")
    private String endereco;

    public Fornecedor() {
    }

    public Fornecedor(Integer id) {
        this.id = id;
    }

    public Fornecedor(Integer id, String cnpj, String email, String nome, String telefone, String endereco) {
        this.id = id;
        this.cnpj = cnpj;
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        String oldCnpj = this.cnpj;
        this.cnpj = cnpj;
        changeSupport.firePropertyChange("cnpj", oldCnpj, cnpj);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedor_1)) {
            return false;
        }
        Fornecedor_1 other = (Fornecedor_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projetofarmacia.Fornecedor_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
