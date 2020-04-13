package org.demo.graphql.vakgroepapi.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.demo.graphql.vakgroepapi.model.Deelnemer;
import org.demo.graphql.vakgroepapi.model.DeelnemerVakgroep;
import org.demo.graphql.vakgroepapi.model.Vakgroep;
import org.demo.graphql.vakgroepapi.repository.DeelnemerRepository;
import org.demo.graphql.vakgroepapi.repository.DeelnemerVakgroepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeelnemerService {

	@Autowired
	private DeelnemerRepository deelnemerpRepository;

	@Autowired
	private DeelnemerVakgroepRepository deelnemerVakgroepRepository;

	public List<Deelnemer> findAll() {
		return deelnemerpRepository.findAll();
	}

	public List<Deelnemer> findAllDeelnemerForVakgroep(Vakgroep vakgroep) {
		List<DeelnemerVakgroep> dv = deelnemerVakgroepRepository.findAllByVakgroepId(vakgroep.getId());

		return dv.stream().map(e -> deelnemerpRepository.findById(e.getDeelnemerId())).filter(Optional::isPresent)
				.map(Optional::get).collect(Collectors.toList());
	}

}
