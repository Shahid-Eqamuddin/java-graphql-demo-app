package org.demo.graphql.vakgroepapi.repository;

import java.util.List;

import org.demo.graphql.vakgroepapi.model.DeelnemerVakgroep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeelnemerVakgroepRepository extends JpaRepository<DeelnemerVakgroep, Long> {
	List<DeelnemerVakgroep> findAllByDeelnemerId(Long vakgroepId);
	
	List<DeelnemerVakgroep> findAllByVakgroepId(Long vakgroepId);
	
}
