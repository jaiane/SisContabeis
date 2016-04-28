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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Jaiane
 */
@Entity
public class Fcpj implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    @ManyToOne
    private Evento evento;
    @OneToOne
    private DadosEmpresa dadosEmpresa;
    @OneToOne
    private EnderecoPessoaJuridica EnderecoPessoaJuridica;
    @OneToOne
    private AtvEconomica atvEconomica;
    
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
        Fcpj other = (Fcpj) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fcpj.enderecoPessoaJuridica[ id=" + getId() + " ]";
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
     * @return the evento
     */
    public Evento getEvento() {
        return evento;
    }

    /**
     * @param evento the evento to set
     */
    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    /**
     * @return the dadosEmpresa
     */
    public DadosEmpresa getDadosEmpresa() {
        return dadosEmpresa;
    }

    /**
     * @param dadosEmpresa the dadosEmpresa to set
     */
    public void setDadosEmpresa(DadosEmpresa dadosEmpresa) {
        this.dadosEmpresa = dadosEmpresa;
    }

    /**
     * @return the EnderecoPessoaJuridica
     */
    public EnderecoPessoaJuridica getEnderecoPessoaJuridica() {
        return EnderecoPessoaJuridica;
    }

    /**
     * @param EnderecoPessoaJuridica the EnderecoPessoaJuridica to set
     */
    public void setEnderecoPessoaJuridica(EnderecoPessoaJuridica EnderecoPessoaJuridica) {
        this.EnderecoPessoaJuridica = EnderecoPessoaJuridica;
    }

    /**
     * @return the atvEconomica
     */
    public AtvEconomica getAtvEconomica() {
        return atvEconomica;
    }

    /**
     * @param atvEconomica the atvEconomica to set
     */
    public void setAtvEconomica(AtvEconomica atvEconomica) {
        this.atvEconomica = atvEconomica;
    }
    
    
}
