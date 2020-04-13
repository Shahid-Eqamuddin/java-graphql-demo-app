package org.demo.graphql.vakgroepapi.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.demo.graphql.vakgroepapi.model.Deelnemer;
import org.demo.graphql.vakgroepapi.model.DeelnemerVakgroep;
import org.demo.graphql.vakgroepapi.model.Sessie;
import org.demo.graphql.vakgroepapi.model.SessieVakgroep;
import org.demo.graphql.vakgroepapi.model.Vakgroep;
import org.demo.graphql.vakgroepapi.repository.DeelnemerVakgroepRepository;
import org.demo.graphql.vakgroepapi.repository.SessieRepository;
import org.demo.graphql.vakgroepapi.repository.SessieVakgroepRepository;
import org.demo.graphql.vakgroepapi.repository.VakgroepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessieService {

	@Autowired
	private SessieRepository sessieRepository;	
	
	@Autowired
	private SessieVakgroepRepository sessieVakgroepRepository;

	public List<Sessie> findAll() {
		return sessieRepository.findAll();
	}

	public List<Sessie> findAllSessieForVakgroep(Vakgroep vakgroep) {
		List<SessieVakgroep> sv = sessieVakgroepRepository.findAllByVakgroepId(vakgroep.getId());

		return sv.stream().map(e -> sessieRepository.findById(e.getSessieId())).filter(Optional::isPresent)
				.map(Optional::get).collect(Collectors.toList());
	}

}
