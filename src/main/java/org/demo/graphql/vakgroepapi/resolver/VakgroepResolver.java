package org.demo.graphql.vakgroepapi.resolver;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.demo.graphql.vakgroepapi.model.Deelnemer;
import org.demo.graphql.vakgroepapi.model.Sessie;
import org.demo.graphql.vakgroepapi.model.Vakgroep;
import org.demo.graphql.vakgroepapi.service.DeelnemerService;
import org.demo.graphql.vakgroepapi.service.SessieService;
import org.demo.graphql.vakgroepapi.service.VakgroepService;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

import graphql.schema.DataFetchingEnvironment;

@Component
public class VakgroepResolver implements GraphQLResolver<Vakgroep> {

	@Resource
	DeelnemerService deelnemerService;

	@Resource
	SessieService sessieService;

	public List<Deelnemer> deelnemers(Vakgroep vakgroep) {

		return deelnemerService.findAllDeelnemerForVakgroep(vakgroep);
	}

	public List<Sessie> sessies(Vakgroep vakgroep) {

		return sessieService.findAllSessieForVakgroep(vakgroep);
	}

	
	public List<Sessie> sessies(Vakgroep vakgroep, int first, int last) {
		// this is a rubbish implementation of filters, should be fixed later
		if (first != 0 || last != 0) {
			if (first == 0) {
				first = last;
			}
			else {
				last= first;
			}
			return sessieService.findAllSessieForVakgroep(vakgroep).stream().limit(first).collect(Collectors.toList());
		} else {
			return sessieService.findAllSessieForVakgroep(vakgroep);
		}
	}

}
