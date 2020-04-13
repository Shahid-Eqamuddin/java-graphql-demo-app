package org.demo.graphql.vakgroepapi.repository;

import org.demo.graphql.vakgroepapi.model.Deelnemer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeelnemerRepository extends JpaRepository<Deelnemer,Long> {

}
