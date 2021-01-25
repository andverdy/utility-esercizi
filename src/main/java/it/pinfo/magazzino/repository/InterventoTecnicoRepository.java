package it.pinfo.magazzino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.pinfo.magazzino.entity.InterventoTecnico;

@Repository
public interface InterventoTecnicoRepository extends JpaRepository<InterventoTecnico, Integer> {

}
