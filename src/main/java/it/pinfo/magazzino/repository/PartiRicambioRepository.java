
package it.pinfo.magazzino.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.pinfo.magazzino.entity.PartiRicambio;

@Repository
public interface PartiRicambioRepository extends JpaRepository<PartiRicambio, Long> {

	@Query(value = "select id_parte from parti_ricambio_in_carico WHERE stato = :stato", nativeQuery = true)
	List<Long> listIdParti(@Param("stato") String stato);

	PartiRicambio findByMatricola(@Param("matricola") String matricola);

}
