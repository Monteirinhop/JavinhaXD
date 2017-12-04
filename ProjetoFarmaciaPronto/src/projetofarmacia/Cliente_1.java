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
@Table(name = "Cliente", catalog = "ProjetoFarmacia", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cliente_1.findAll", query = "SELECT c FROM Cliente_1 c")
    , @NamedQuery(name = "Cliente_1.findById", query = "SELECT c FROM Cliente_1 c WHERE c.id = :id")
    , @NamedQuery(name = "Cliente_1.findByNome", query = "SELECT c FROM Cliente_1 c WHERE c.nome = :nome")
    , @NamedQuery(name = "Cliente_1.findByEmail", query = "SELECT c FROM Cliente_1 c WHERE c.email = :email")
    , @NamedQuery(name = "Cliente_1.findByRg", query = "SELECT c FROM Cliente_1 c WHERE c.rg = :rg")
    , @NamedQuery(name = "Cliente_1.findByTelefone", query = "SELECT c FROM Cliente_1 c WHERE c.telefone = :telefone")
    , @NamedQuery(name = "Cliente_1.findByEndere\u00e7o", query = "SELECT c FROM Cliente_1 c WHERE c.endere\u00e7o = :endere\u00e7o")
    , @NamedQuery(name = "Cliente_1.findByCpf", query = "SELECT c FROM Cliente_1 c WHERE c.cpf = :cpf")
    , @NamedQuery(name = "Cliente_1.findByNomeRemedio", query = "SELECT c FROM Cliente_1 c WHERE c.nomeRemedio = :nomeRemedio")
    , @NamedQuery(name = "Cliente_1.findByDosagem", query = "SELECT c FROM Cliente_1 c WHERE c.dosagem = :dosagem")
    , @NamedQuery(name = "Cliente_1.findByDataNasc", query = "SELECT c FROM Cliente_1 c WHERE c.dataNasc = :dataNasc")})
public class Cliente_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @Column(name = "RG")
    private int rg;
    @Basic(optional = false)
    @Column(name = "Telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "Endere\u00e7o")
    private String endereço;
    @Basic(optional = false)
    @Column(name = "CPF")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "NomeRemedio")
    private String nomeRemedio;
    @Basic(optional = false)
    @Column(name = "Dosagem")
    private String dosagem;
    @Basic(optional = false)
    @Column(name = "DataNasc")
    private String dataNasc;

    public Cliente_1() {
    }

    public Cliente_1(Integer id) {
        this.id = id;
    }

    public Cliente_1(Integer id, String nome, String email, int rg, String telefone, String endereço, String cpf, String nomeRemedio, String dosagem, String dataNasc) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.rg = rg;
        this.telefone = telefone;
        this.endereço = endereço;
        this.cpf = cpf;
        this.nomeRemedio = nomeRemedio;
        this.dosagem = dosagem;
        this.dataNasc = dataNasc;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public String getNomeRemedio() {
        return nomeRemedio;
    }

    public void setNomeRemedio(String nomeRemedio) {
        String oldNomeRemedio = this.nomeRemedio;
        this.nomeRemedio = nomeRemedio;
        changeSupport.firePropertyChange("nomeRemedio", oldNomeRemedio, nomeRemedio);
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        String oldDosagem = this.dosagem;
        this.dosagem = dosagem;
        changeSupport.firePropertyChange("dosagem", oldDosagem, dosagem);
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        String oldDataNasc = this.dataNasc;
        this.dataNasc = dataNasc;
        changeSupport.firePropertyChange("dataNasc", oldDataNasc, dataNasc);
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
        if (!(object instanceof Cliente_1)) {
            return false;
        }
        Cliente_1 other = (Cliente_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projetofarmacia.Cliente_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
