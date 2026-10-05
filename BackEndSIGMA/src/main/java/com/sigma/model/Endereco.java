package com.sigma.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
   private String numero;
   private String bairro;

   public String getrua(){
       return rua;
   }
   public void setrua(String rua){
       this.rua = rua;
   }
   public String getcidade(){
       return cidade;
   }
   public void setcidade(String cidade){
       this.cidade = cidade;
   }
   public String getestado(){
       return estado;
   }
   public void setestado(String estado){
       this.estado = estado;
   }
   public String getpais(){
       return pais;
   }
   public void setpais(String pais){
       this.pais = pais;
   }
   public String getcep(){
       return cep;
   }
   public void setcep(String cep){
       this.cep = cep;
   }
   public String getnumero(){
       return numero;
   }
   public void setnumero(String numero){
       this.numero = numero;
   }
   public String getbairro(){
       return bairro;
   }
   public void setbairro(String bairro){
       this.bairro = bairro;
   }
   public Long getid(){
       return id;
   }
   public void setid(Long id){
       this.id = id;
   }


}
