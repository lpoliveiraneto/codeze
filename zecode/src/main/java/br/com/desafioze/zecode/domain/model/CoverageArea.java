package br.com.desafioze.zecode.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class CoverageArea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_coverageArea")
    private Long id;
    public String type;
//    public  List<List<List<List<Integer>>>> coordinates;
}
