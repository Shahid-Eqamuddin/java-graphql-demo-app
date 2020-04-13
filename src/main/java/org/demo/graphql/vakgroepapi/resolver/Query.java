package org.demo.graphql.vakgroepapi.resolver;

import java.util.List;

import javax.annotation.Resource;

import org.demo.graphql.vakgroepapi.model.Deelnemer;
import org.demo.graphql.vakgroepapi.model.Sessie;
import org.demo.graphql.vakgroepapi.model.Vakgroep;
import org.demo.graphql.vakgroepapi.service.DeelnemerService;
import org.demo.graphql.vakgroepapi.service.SessieService;
import org.demo.graphql.vakgroepapi.service.VakgroepService;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {

	@Resource
	private VakgroepService vakgroepService;
	@Resource
	private DeelnemerService deelnemerService;
	@Resource
	private SessieService sesieService;

	public List<Sessie> sessies() {
		return sesieService.findAll();
	}
	
	public List<Vakgroep> vakgroepen() {
		System.out.print("hello");
		return vakgroepService.findAll();
	}
	
	public List<Deelnemer> deelnemers() {		
		return deelnemerService.findAll();				
	}
}
