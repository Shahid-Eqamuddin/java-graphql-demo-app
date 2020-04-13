package org.demo.graphql.vakgroepapi.repository;

import org.demo.graphql.vakgroepapi.model.Sessie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessieRepository extends JpaRepository<Sessie, Long> {

}
