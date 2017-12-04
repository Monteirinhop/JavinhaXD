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
@Table(name = "Remedio", catalog = "ProjetoFarmacia", schema = "")
@NamedQueries({
    @NamedQuery(name = "Remedio.findAll", query = "SELECT r FROM Remedio r")
    , @NamedQuery(name = "Remedio.findById", query = "SELECT r FROM Remedio r WHERE r.id = :id")
    , @NamedQuery(name = "Remedio.findByNomeRemedio", query = "SELECT r FROM Remedio r WHERE r.nomeRemedio = :nomeRemedio")
    , @NamedQuery(name = "Remedio.findByDosagem", query = "SELECT r FROM Remedio r WHERE r.dosagem = :dosagem")
    , @NamedQuery(name = "Remedio.findByTempoDeUso", query = "SELECT r FROM Remedio r WHERE r.tempoDeUso = :tempoDeUso")})
public class Remedio implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "NomeRemedio")
    private String nomeRemedio;
    @Column(name = "Dosagem")
    private String dosagem;
    @Column(name = "TempoDeUso")
    @Temporal(TemporalType.DATE)
    private Date tempoDeUso;

    public Remedio() {
    }

    public Remedio(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
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

    public Date getTempoDeUso() {
        return tempoDeUso;
    }

    public void setTempoDeUso(Date tempoDeUso) {
        Date oldTempoDeUso = this.tempoDeUso;
        this.tempoDeUso = tempoDeUso;
        changeSupport.firePropertyChange("tempoDeUso", oldTempoDeUso, tempoDeUso);
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
        if (!(object instanceof Remedio)) {
            return false;
        }
        Remedio other = (Remedio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projetofarmacia.Remedio[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
