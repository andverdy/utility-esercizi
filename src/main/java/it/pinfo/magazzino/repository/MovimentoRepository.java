package it.pinfo.magazzino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.pinfo.magazzino.entity.Movimento;

@Repository
public interface MovimentoRepository extends JpaRepository<Movimento, Integer> {

}
