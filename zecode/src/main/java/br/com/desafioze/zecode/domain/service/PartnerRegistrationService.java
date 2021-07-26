package br.com.desafioze.zecode.domain.service;

import br.com.desafioze.zecode.domain.exception.PartnerNotFoundException;
import br.com.desafioze.zecode.domain.model.Partner;
import br.com.desafioze.zecode.domain.repository.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PartnerRegistrationService {

    @Autowired
    private PartnerRepository partnerRepository;

    public Partner save(Partner partner){
        return partnerRepository.save(partner);
    }

    public Partner searchId(Long partnerId){
        Optional<Partner> partnerOptional = partnerRepository.findById(partnerId);

        return  partnerOptional.orElseThrow(() -> new PartnerNotFoundException(String.format("No partner found with this id")));
    }
}
