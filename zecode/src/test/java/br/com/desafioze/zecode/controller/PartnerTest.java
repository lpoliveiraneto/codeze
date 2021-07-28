package br.com.desafioze.zecode.controller;

import br.com.desafioze.zecode.api.controller.PartnerController;
import br.com.desafioze.zecode.domain.service.PartnerRegistrationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class PartnerTest {

    @Mock
    private PartnerRegistrationService partnerRegistrationService;

    @InjectMocks
    private PartnerController partnerController;

    @Test
    public void getPartnerByIDReturnHttpStatusNotFound(){
        Long id = 1L;

    }

}
