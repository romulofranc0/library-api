package io.github.romulofranc0.libraryapi.repositories;

import io.github.romulofranc0.libraryapi.entities.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AutorRepository extends JpaRepository<Autor, UUID> {
}
