package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PokemonShapeSummary;

@Canonical
class PaginatedPokemonShapeSummaryList {
    
    Integer count
    
    URI next
    
    URI previous
    
    List<PokemonShapeSummary> results = new ArrayList<>()
}
