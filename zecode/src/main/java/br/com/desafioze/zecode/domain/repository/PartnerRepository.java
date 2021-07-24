package br.com.desafioze.zecode.domain.repository;

import br.com.desafioze.zecode.domain.model.Partner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartnerRepository extends JpaRepository<Partner, Long> {
}
