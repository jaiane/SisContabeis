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
import javax.persistence.OneToOne;

/**
 *
 * @author Jaiane
 */

@Entity
public class EnderecoPessoaJuridica implements Serializable {

    @OneToOne(mappedBy = "EnderecoPessoaJuridica")
    private Fcpj fcpj;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String Complemento;
    private String Referência;
    private String Logradouro;
    private String Número;
    private String Bairro;
    private String CEP;
    private String Município;
    private String UF;
    private String TipoLogradouro;
    
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
        EnderecoPessoaJuridica other = (EnderecoPessoaJuridica) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.enderecoPessoaJuridica[ id=" + getId() + " ]";
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
     * @return the Complemento
     */
    public String getComplemento() {
        return Complemento;
    }

    /**
     * @param Complemento the Complemento to set
     */
    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    /**
     * @return the Referência
     */
    public String getReferência() {
        return Referência;
    }

    /**
     * @param Referência the Referência to set
     */
    public void setReferência(String Referência) {
        this.Referência = Referência;
    }

    /**
     * @return the Logradouro
     */
    public String getLogradouro() {
        return Logradouro;
    }

    /**
     * @param Logradouro the Logradouro to set
     */
    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }

    /**
     * @return the Número
     */
    public String getNúmero() {
        return Número;
    }

    /**
     * @param Número the Número to set
     */
    public void setNúmero(String Número) {
        this.Número = Número;
    }

    /**
     * @return the Bairro
     */
    public String getBairro() {
        return Bairro;
    }

    /**
     * @param Bairro the Bairro to set
     */
    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    /**
     * @return the CEP
     */
    public String getCEP() {
        return CEP;
    }

    /**
     * @param CEP the CEP to set
     */
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    /**
     * @return the Município
     */
    public String getMunicípio() {
        return Município;
    }

    /**
     * @param Município the Município to set
     */
    public void setMunicípio(String Município) {
        this.Município = Município;
    }

    /**
     * @return the UF
     */
    public String getUF() {
        return UF;
    }

    /**
     * @param UF the UF to set
     */
    public void setUF(String UF) {
        this.UF = UF;
    }

    /**
     * @return the TipoLogradouro
     */
    public String getTipoLogradouro() {
        return TipoLogradouro;
    }

    /**
     * @param TipoLogradouro the TipoLogradouro to set
     */
    public void setTipoLogradouro(String TipoLogradouro) {
        this.TipoLogradouro = TipoLogradouro;
    }
}
