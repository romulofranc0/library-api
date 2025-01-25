package entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    private String nome;
    @Column(name = "data_nascimento")
    private Instant dataNascimento;
    private String nacionalidade;
}
