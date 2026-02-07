package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;
import org.openapitools.model.VersionSummary;

@Canonical
class PokemonSpeciesFlavorText {
    
    String flavorText
    
    LanguageSummary language
    
    VersionSummary version
}
