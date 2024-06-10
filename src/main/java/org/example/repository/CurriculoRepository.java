package org.example.repository;

import org.example.model.Curriculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
    // Métodos personalizados, se necessário
}
