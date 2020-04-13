package org.demo.graphql.vakgroepapi.resolver;

import java.util.List;

import javax.annotation.Resource;

import org.demo.graphql.vakgroepapi.model.Deelnemer;
import org.demo.graphql.vakgroepapi.model.Vakgroep;
import org.demo.graphql.vakgroepapi.service.VakgroepService;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

@Component
public class DeelnemerResolver implements GraphQLResolver<Deelnemer> {

	@Resource
	VakgroepService vakgroepService;
	
	public List<Vakgroep> vakgroepen(Deelnemer deelnemer) {
		
		return vakgroepService.findAllVakgroepByDeelnemer(deelnemer);
	}

}
