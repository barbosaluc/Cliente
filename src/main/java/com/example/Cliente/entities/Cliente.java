package com.example.Cliente.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class Cliente implements Serializable {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     private Long numeroConta;

     @Column(name = "nome" , nullable = false )
     private String nome;

  @Column(name = "idade" , nullable = false)
    private String idade;

  @Column(name = "cpf", nullable = false)
    private String cpf;

    private Double saldo;

    // Getter para id
  public Long getId() {
       return id;
    }

   // Setter para id
   public void setId(Long id) {
       this.id = id;
   }
}
