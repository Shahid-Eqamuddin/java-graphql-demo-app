package org.demo.graphql.vakgroepapi.repository;

import java.util.List;

import org.demo.graphql.vakgroepapi.model.SessieVakgroep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessieVakgroepRepository extends JpaRepository<SessieVakgroep, Long> {
	List<SessieVakgroep> findAllBySessieId(Long vakgroepId);

	List<SessieVakgroep> findAllByVakgroepId(Long vakgroepId);

}
