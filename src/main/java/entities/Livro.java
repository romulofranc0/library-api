package entities;

import jakarta.persistence.*;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    private String isbn;
    private String titulo;
    @Column(name = "data_publicacao")
    private String dataPublicacao;
    private Generos generos;
    private Double preco;
    @ManyToOne
    private Autor id_autor;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
