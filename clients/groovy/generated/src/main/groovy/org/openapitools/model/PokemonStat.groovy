package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.StatSummary;

@Canonical
class PokemonStat {
    /* The base value of the stat. */
    Integer baseStat
    /* The effort points (EV) the Pokémon has in the stat. */
    Integer effort
    /* The stat the Pokémon has. */
    StatSummary stat
}
