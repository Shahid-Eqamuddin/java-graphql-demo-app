package org.demo.graphql.vakgroepapi.repository;

import org.demo.graphql.vakgroepapi.model.Vakgroep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VakgroepRepository extends JpaRepository<Vakgroep,Long> {

}
