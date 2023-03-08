package br.com.zupacademy.gabrielf.casadocodigo.repository;

import br.com.zupacademy.gabrielf.casadocodigo.modelo.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository<Pais,Long> {
}
