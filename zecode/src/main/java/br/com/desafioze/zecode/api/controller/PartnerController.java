package br.com.desafioze.zecode.api.controller;

import br.com.desafioze.zecode.domain.model.Partner;
import br.com.desafioze.zecode.domain.service.PartnerRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Part;

@RestController
@RequestMapping("/partners")
public class PartnerController {

    @Autowired
    private PartnerRegistrationService partnerRegistration;

    @PostMapping
 //   @ResponseStatus(HttpStatus.CREATED)
    public Partner registration( @RequestBody Partner partner){
        return partnerRegistration.save(partner);
    }
}
