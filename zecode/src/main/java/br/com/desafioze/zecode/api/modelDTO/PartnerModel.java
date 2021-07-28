package br.com.desafioze.zecode.api.modelDTO;

import com.vividsolutions.jts.geom.MultiPolygon;
import com.vividsolutions.jts.geom.Point;
import lombok.Data;

@Data
public class PartnerModel {

    private Long id;

    private String tradingName;

    private String ownerName;

    private String document;

    private MultiPolygon coverageArea;

    private Point address;

}
