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
@Table(name = "Remedios", catalog = "ProjetoFarmacia", schema = "")
@NamedQueries({
    @NamedQuery(name = "Remedios.findAll", query = "SELECT r FROM Remedios r")
    , @NamedQuery(name = "Remedios.findById", query = "SELECT r FROM Remedios r WHERE r.id = :id")
    , @NamedQuery(name = "Remedios.findByNomeRemedio", query = "SELECT r FROM Remedios r WHERE r.nomeRemedio = :nomeRemedio")
    , @NamedQuery(name = "Remedios.findByDosagem", query = "SELECT r FROM Remedios r WHERE r.dosagem = :dosagem")})
public class Remedios implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "NomeRemedio")
    private String nomeRemedio;
    @Basic(optional = false)
    @Column(name = "Dosagem")
    private String dosagem;

    public Remedios() {
    }

    public Remedios(Integer id) {
        this.id = id;
    }

    public Remedios(Integer id, String nomeRemedio, String dosagem) {
        this.id = id;
        this.nomeRemedio = nomeRemedio;
        this.dosagem = dosagem;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Remedios)) {
            return false;
        }
        Remedios other = (Remedios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "projetofarmacia.Remedios[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
