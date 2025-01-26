package io.github.romulofranc0.libraryapi.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Table(name = "livro")
@Data
@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "isbn", nullable = false, length = 20)
    private String isbn;
    @Column(name = "titulo", nullable = false, length = 150)
    private String titulo;
    @Column(name = "data_publicacao")
    private LocalDate dataPublicacao;

    @Enumerated(EnumType.STRING)
    @Column(name = "genero", nullable = false, length = 30)
    private GeneroLivro genero;
    @Column(name = "preco")
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Autor autor;

}
