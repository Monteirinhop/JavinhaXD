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
@Table(name = "fornecedores", catalog = "sell", schema = "")
@NamedQueries({
    @NamedQuery(name = "Fornecedores.findAll", query = "SELECT f FROM Fornecedores f"),
    @NamedQuery(name = "Fornecedores.findById", query = "SELECT f FROM Fornecedores f WHERE f.id = :id"),
    @NamedQuery(name = "Fornecedores.findByNome", query = "SELECT f FROM Fornecedores f WHERE f.nome = :nome"),
    @NamedQuery(name = "Fornecedores.findByCnpj", query = "SELECT f FROM Fornecedores f WHERE f.cnpj = :cnpj"),
    @NamedQuery(name = "Fornecedores.findByInscEstatual", query = "SELECT f FROM Fornecedores f WHERE f.inscEstatual = :inscEstatual"),
    @NamedQuery(name = "Fornecedores.findByTelefone", query = "SELECT f FROM Fornecedores f WHERE f.telefone = :telefone"),
    @NamedQuery(name = "Fornecedores.findByCep", query = "SELECT f FROM Fornecedores f WHERE f.cep = :cep"),
    @NamedQuery(name = "Fornecedores.findByEndereco", query = "SELECT f FROM Fornecedores f WHERE f.endereco = :endereco"),
    @NamedQuery(name = "Fornecedores.findByCidade", query = "SELECT f FROM Fornecedores f WHERE f.cidade = :cidade"),
    @NamedQuery(name = "Fornecedores.findByContato", query = "SELECT f FROM Fornecedores f WHERE f.contato = :contato"),
    @NamedQuery(name = "Fornecedores.findByEmail", query = "SELECT f FROM Fornecedores f WHERE f.email = :email")})
public class Fornecedores implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "cnpj")
    private String cnpj;
    @Basic(optional = false)
    @Column(name = "inscEstatual")
    private String inscEstatual;
    @Basic(optional = false)
    @Column(name = "telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "cep")
    private String cep;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "cidade")
    private String cidade;
    @Basic(optional = false)
    @Column(name = "contato")
    private String contato;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;

    public Fornecedores() {
    }

    public Fornecedores(Integer id) {
        this.id = id;
    }

    public Fornecedores(Integer id, String nome, String cnpj, String inscEstatual, String telefone, String cep, String endereco, String cidade, String contato, String email) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.inscEstatual = inscEstatual;
        this.telefone = telefone;
        this.cep = cep;
        this.endereco = endereco;
        this.cidade = cidade;
        this.contato = contato;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        String oldCnpj = this.cnpj;
        this.cnpj = cnpj;
        changeSupport.firePropertyChange("cnpj", oldCnpj, cnpj);
    }

    public String getInscEstatual() {
        return inscEstatual;
    }

    public void setInscEstatual(String inscEstatual) {
        String oldInscEstatual = this.inscEstatual;
        this.inscEstatual = inscEstatual;
        changeSupport.firePropertyChange("inscEstatual", oldInscEstatual, inscEstatual);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        String oldCidade = this.cidade;
        this.cidade = cidade;
        changeSupport.firePropertyChange("cidade", oldCidade, cidade);
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        String oldContato = this.contato;
        this.contato = contato;
        changeSupport.firePropertyChange("contato", oldContato, contato);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
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
        if (!(object instanceof Fornecedores)) {
            return false;
        }
        Fornecedores other = (Fornecedores) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "formdesenvolvimento.Fornecedores[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
