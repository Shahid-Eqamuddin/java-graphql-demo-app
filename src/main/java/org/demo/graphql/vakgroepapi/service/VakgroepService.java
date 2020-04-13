package org.demo.graphql.vakgroepapi.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.demo.graphql.vakgroepapi.model.Deelnemer;
import org.demo.graphql.vakgroepapi.model.DeelnemerVakgroep;
import org.demo.graphql.vakgroepapi.model.Vakgroep;
import org.demo.graphql.vakgroepapi.repository.DeelnemerVakgroepRepository;
import org.demo.graphql.vakgroepapi.repository.VakgroepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VakgroepService {

	@Autowired
	private VakgroepRepository vakgroepRepository;

	@Autowired
	private DeelnemerVakgroepRepository deelnemerVakgroepRepository;

	public List<Vakgroep> findAll() {
		return vakgroepRepository.findAll();
	}

	public List<Vakgroep> findAllVakgroepByDeelnemer(Deelnemer deelnemer) {
		List<DeelnemerVakgroep> dv = deelnemerVakgroepRepository.findAllByDeelnemerId(deelnemer.getId());

		return dv.stream().map(e -> vakgroepRepository.findById(e.getVakgroepId())).filter(Optional::isPresent)
				.map(Optional::get).collect(Collectors.toList());
	}

}
