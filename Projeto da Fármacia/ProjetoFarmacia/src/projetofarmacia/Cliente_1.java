/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofarmacia;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author gustavo
 */
@Entity
@Table(name = "Cliente", catalog = "ProjetoFarmacia", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cliente_1.findAll", query = "SELECT c FROM Cliente_1 c")
    , @NamedQuery(name = "Cliente_1.findByCpf", query = "SELECT c FROM Cliente_1 c WHERE c.cpf = :cpf")
    , @NamedQuery(name = "Cliente_1.findByNome", query = "SELECT c FROM Cliente_1 c WHERE c.nome = :nome")
    , @NamedQuery(name = "Cliente_1.findByEmail", query = "SELECT c FROM Cliente_1 c WHERE c.email = :email")
    , @NamedQuery(name = "Cliente_1.findByDataNasc", query = "SELECT c FROM Cliente_1 c WHERE c.dataNasc = :dataNasc")
    , @NamedQuery(name = "Cliente_1.findByRg", query = "SELECT c FROM Cliente_1 c WHERE c.rg = :rg")
    , @NamedQuery(name = "Cliente_1.findByTelefone", query = "SELECT c FROM Cliente_1 c WHERE c.telefone = :telefone")
    , @NamedQuery(name = "Cliente_1.findByEndere\u00e7o", query = "SELECT c FROM Cliente_1 c WHERE c.endere\u00e7o = :endere\u00e7o")})
public class Cliente_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CPF")
    private Integer cpf;
    @Basic(optional = false)
    @Column(name = "Nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @Column(name = "DataNasc")
    @Temporal(TemporalType.DATE)
    private Date dataNasc;
    @Basic(optional = false)
    @Column(name = "RG")
    private int rg;
    @Basic(optional = false)
    @Column(name = "Telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "Endere\u00e7o")
    private String endereço;

    public Cliente_1() {
    }

    public Cliente_1(Integer cpf) {
        this.cpf = cpf;
    }

    public Cliente_1(Integer cpf, String nome, String email, Date dataNasc, int rg, String telefone, String endereço) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.dataNasc = dataNasc;
        this.rg = rg;
        this.telefone = telefone;
        this.endereço = endereço;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        Integer oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        Date oldDataNasc = this.dataNasc;
        this.dataNasc = dataNasc;
        changeSupport.firePropertyChange("dataNasc", oldDataNasc, dataNasc);
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        int oldRg = this.rg;
        this.rg = rg;
        changeSupport.firePropertyChange("rg", oldRg, rg);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        String oldEndereço = this.endereço;
        this.endereço = endereço;
        changeSupport.firePropertyChange("endere\u00e7o", oldEndereço, endereço);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpf != null ? cpf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente_1)) {
            return false;
        }
        Cliente_1 other = (Cliente_1) object;
        if ((this.cpf == null && other.cpf != null) || (this.cpf != null && !this.cpf.equals(other.cpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projetofarmacia.Cliente_1[ cpf=" + cpf + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
