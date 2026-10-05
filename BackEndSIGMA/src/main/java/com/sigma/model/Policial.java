package com.sigma.model;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "Policial")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Policial {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long polId;

     private String polName;
     private String polDescricao;
     private String polCPF;
     private String polCVC;
     private String polDataNascimento;
     private String polCargo;
     private String polPatente;

public  long getPolId() {
	return polId;
}
public void setPolId(long polId) {
    this.polId = polId;
}
public String getPolName() {
	return polName;
}
public void setPolName(String polName) {
    this.polName = polName;
}
public String getPolDescricao() {
    return polDescricao;
}
public void setPolDescricao(String polDescricao) {
    this.polDescricao = polDescricao;
}
public String getPolCPF() {
    return polCPF;
}
public void setPolCPF(String polCPF) {
    this.polCPF = polCPF;
}
public String getPolCVC() {
    return polCVC;
}
public void setPolCVC(String polCVC) {
    this.polCVC = polCVC;
}
public String getPolDataNascimento() {
    return polDataNascimento;
}
public void setPolDataNascimento(String polDataNascimento) {
    this.polDataNascimento = polDataNascimento;
}
public String getPolCargo() {
    return polCargo;
}
public void setPolCargo(String polCargo) {
    this.polCargo = polCargo;
}
public String getPolPatente() {
    return polPatente;
}
public void setPolPatente(String polPatente) {
    this.polPatente = polPatente;
}




}


