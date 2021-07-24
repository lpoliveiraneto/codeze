package br.com.desafioze.zecode.domain.service;

import br.com.desafioze.zecode.domain.model.Partner;
import br.com.desafioze.zecode.domain.repository.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartnerRegistrationService {

    @Autowired
    private PartnerRepository partnerRepository;

    public Partner save(Partner partner){
        return partnerRepository.save(partner);
    }
}
