package br.com.desafioze.zecode.domain.model;

import br.com.desafioze.zecode.domain.model.Address;
import br.com.desafioze.zecode.domain.model.CoverageArea;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
public class Partner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_partner")
    private Long id;

    private String trandingName;

    private String ownerName;

    private String document;

//    @OneToOne(cascade = CascadeType.ALL)
//    private CoverageArea coverageArea;
//
//    @OneToOne (cascade = CascadeType.ALL)
//    private Address address;

}
