package it.pinfo.magazzino.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.pinfo.magazzino.entity.VariabiliDb;

@Repository
public interface IndiciRepository extends JpaRepository<VariabiliDb, Integer> {
	
}
