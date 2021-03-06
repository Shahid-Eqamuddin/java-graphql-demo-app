package org.demo.graphql.vakgroepapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Deelnemer {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	private Long id;	 
    private String naam;    

}
