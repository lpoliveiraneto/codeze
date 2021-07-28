package br.com.desafioze.zecode.api.controller;

import br.com.desafioze.zecode.api.modelDTO.PartnerInput;
import br.com.desafioze.zecode.api.modelDTO.PartnerModel;
import br.com.desafioze.zecode.domain.model.Partner;
import br.com.desafioze.zecode.domain.service.PartnerRegistrationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/partners")
public class PartnerController {

    @Autowired
    private PartnerRegistrationService partnerRegistration;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PartnerModel registration( @RequestBody PartnerInput partnerInput){
        Partner partner = toEntity(partnerInput);

        return toModel(partnerRegistration.save(partner));
    }

    @GetMapping("/{id}")
    public Partner partnerFindById(@PathVariable Long id){

        return partnerRegistration.searchId(id);
    }

    private Partner toEntity(PartnerInput partnerInput ){
        return modelMapper.map(partnerInput, Partner.class);
    }

    private PartnerModel toModel( Partner partner){
        return modelMapper.map(partner, PartnerModel.class);
    }


}
