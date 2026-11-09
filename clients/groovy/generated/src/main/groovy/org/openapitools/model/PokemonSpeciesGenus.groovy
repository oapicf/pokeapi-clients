package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;

@Canonical
class PokemonSpeciesGenus {
    /* The localized genus for the referenced Pokémon species */
    String genus
    /* The language this genus is in. */
    LanguageSummary language
}
