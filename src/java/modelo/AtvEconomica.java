/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Jaiane
 */

@Entity
public class AtvEconomica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String cnaePrincipal;
    private String cnaeSecundaria;
    private String tipoUnidade;
    private String formaAtuacao;
    
     @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Login)) {
            return false;
        }
        AtvEconomica other = (AtvEconomica) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.atvEconomica[ id=" + getId() + " ]";
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the cnaePrincipal
     */
    public String getCnaePrincipal() {
        return cnaePrincipal;
    }

    /**
     * @param cnaePrincipal the cnaePrincipal to set
     */
    public void setCnaePrincipal(String cnaePrincipal) {
        this.cnaePrincipal = cnaePrincipal;
    }

    /**
     * @return the cnaeSecundaria
     */
    public String getCnaeSecundaria() {
        return cnaeSecundaria;
    }

    /**
     * @param cnaeSecundaria the cnaeSecundaria to set
     */
    public void setCnaeSecundaria(String cnaeSecundaria) {
        this.cnaeSecundaria = cnaeSecundaria;
    }

    /**
     * @return the tipoUnidade
     */
    public String getTipoUnidade() {
        return tipoUnidade;
    }

    /**
     * @param tipoUnidade the tipoUnidade to set
     */
    public void setTipoUnidade(String tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }

    /**
     * @return the formaAtuacao
     */
    public String getFormaAtuacao() {
        return formaAtuacao;
    }

    /**
     * @param formaAtuacao the formaAtuacao to set
     */
    public void setFormaAtuacao(String formaAtuacao) {
        this.formaAtuacao = formaAtuacao;
    }
    
    
}
