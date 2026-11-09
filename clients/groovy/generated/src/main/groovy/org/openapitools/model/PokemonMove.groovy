package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.PokemonMoveVersionGroup;

@Canonical
class PokemonMove {
    /* The move the Pokémon can learn. */
    MoveSummary move
    /* The details of the version in which the Pokémon can learn the move. */
    List<PokemonMoveVersionGroup> versionGroupDetails = new ArrayList<>()
}
