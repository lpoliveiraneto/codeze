package br.com.desafioze.zecode.domain.model;


import com.bedatadriven.jackson.datatype.jts.serialization.GeometryDeserializer;
import com.bedatadriven.jackson.datatype.jts.serialization.GeometrySerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.vividsolutions.jts.geom.MultiPolygon;
import com.vividsolutions.jts.geom.Point;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
//import org.n52.jackson.datatype.jts.GeometryDeserializer;
//import org.n52.jackson.datatype.jts.GeometrySerializer;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
public class Partner implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_partner")
    private Long id;

    @Column(nullable = false)
    private String trandingName;

    @Column(nullable = false)
    private String ownerName;

    @Column(unique = true, nullable = false)
    private String document;

    @Column(name = "coverage_area")
    @JsonSerialize(using = GeometrySerializer.class)
    @JsonDeserialize(contentUsing = GeometryDeserializer.class)
    private MultiPolygon coverageArea;

    @Column(name = "address")
    @JsonSerialize(using = GeometrySerializer.class)
    @JsonDeserialize(contentUsing = GeometryDeserializer.class)
    private Point address;
}
