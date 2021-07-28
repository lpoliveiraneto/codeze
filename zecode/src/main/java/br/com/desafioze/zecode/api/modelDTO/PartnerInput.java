package br.com.desafioze.zecode.api.modelDTO;

import com.vividsolutions.jts.geom.MultiPolygon;
import com.vividsolutions.jts.geom.Point;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class PartnerInput  {

    @NotNull
    private Long id;

    @NotNull
    private String tradingName;

    @NotNull
    private String ownerName;

    @NotNull
    private String document;

    @NotNull
    private MultiPolygon coverageArea;

    @NotNull
    private Point address;

}
