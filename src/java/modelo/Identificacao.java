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
public class Identificacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeEmpresarial;
    private String cpfRepresentante;
    private String uf;
    private String municipio;
    private String nomeFantasia;
    private String codNatJuridica;
    private String orgRegistro;
    private String capitalSocial;
    
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
        Identificacao other = (Identificacao) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.identificacao[ id=" + getId() + " ]";
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
     * @return the nomeEmpresarial
     */
    public String getNomeEmpresarial() {
        return nomeEmpresarial;
    }

    /**
     * @param nomeEmpresarial the nomeEmpresarial to set
     */
    public void setNomeEmpresarial(String nomeEmpresarial) {
        this.nomeEmpresarial = nomeEmpresarial;
    }

    /**
     * @return the cpfRepresentante
     */
    public String getCpfRepresentante() {
        return cpfRepresentante;
    }

    /**
     * @param cpfRepresentante the cpfRepresentante to set
     */
    public void setCpfRepresentante(String cpfRepresentante) {
        this.cpfRepresentante = cpfRepresentante;
    }

    /**
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * @return the nomeFantasia
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * @param nomeFantasia the nomeFantasia to set
     */
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    /**
     * @return the codNatJuridica
     */
    public String getCodNatJuridica() {
        return codNatJuridica;
    }

    /**
     * @param codNatJuridica the codNatJuridica to set
     */
    public void setCodNatJuridica(String codNatJuridica) {
        this.codNatJuridica = codNatJuridica;
    }

    /**
     * @return the orgRegistro
     */
    public String getOrgRegistro() {
        return orgRegistro;
    }

    /**
     * @param orgRegistro the orgRegistro to set
     */
    public void setOrgRegistro(String orgRegistro) {
        this.orgRegistro = orgRegistro;
    }

    /**
     * @return the capitalSocial
     */
    public String getCapitalSocial() {
        return capitalSocial;
    }

    /**
     * @param capitalSocial the capitalSocial to set
     */
    public void setCapitalSocial(String capitalSocial) {
        this.capitalSocial = capitalSocial;
    }
    
    
}
