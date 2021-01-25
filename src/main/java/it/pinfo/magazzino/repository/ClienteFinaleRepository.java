package it.pinfo.magazzino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.pinfo.magazzino.entity.ClienteFinale;

@Repository
public interface ClienteFinaleRepository extends JpaRepository<ClienteFinale, Long> {

}
