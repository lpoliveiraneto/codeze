package br.com.desafioze.zecode;

import br.com.desafioze.zecode.api.controller.PartnerController;
import br.com.desafioze.zecode.api.modelDTO.PartnerInput;
import br.com.desafioze.zecode.domain.model.Partner;
import br.com.desafioze.zecode.domain.service.PartnerRegistrationService;
import com.fasterxml.jackson.databind.ObjectMapper;
//import com.vividsolutions.jts.geom.MultiPolygon;
//import com.vividsolutions.jts.geom.Point;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;


class ZecodeApplicationTests {

	@Mock
	private PartnerRegistrationService partnerRegistrationService;

	@InjectMocks
	private PartnerController partnerController;

	@Test
	void contextLoads() {
	}

	@Test
	public void getLocationByIdHttpStatusNotFound (){
		Long id = 10l;

//		when(partnerRegistrationService.searchId(id)).thenReturn(Optional.empty());

	}

}
