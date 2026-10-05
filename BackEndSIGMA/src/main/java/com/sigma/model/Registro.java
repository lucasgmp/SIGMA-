package com.sigma.model;
import jakarta.persistence.*;


@Entity
@Table(name = "resgistro")
public class Registro {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(nullable = false)
    private String numeroRegistro;
@Column(nullable = false)
private String tipoRegistro;
@Column(nullable = false)
    private String orgaoResponsavel;
@Column(nullable = false)
    private String Status;

    public String getnumeroRegistro() {
        return numeroRegistro;
    }
    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;

    }

    public String getTipoRegistro() {
        return tipoRegistro;
    }
    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }
    public String getOrgaoResponsavel() {
        return orgaoResponsavel;
    }
    public void setOrgaoResponsavel(String orgaoResponsavel) {
        this.orgaoResponsavel = orgaoResponsavel;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
}
