package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PokemonShapeAwesomeName;
import org.openapitools.model.PokemonShapeName;
import org.openapitools.model.PokemonSpeciesSummary;

@Canonical
class PokemonShapeDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The \"scientific\" name of this Pokémon shape listed in different languages. */
    List<PokemonShapeAwesomeName> awesomeNames = new ArrayList<>()
    /* The name of this resource listed in different languages. */
    List<PokemonShapeName> names = new ArrayList<>()
    /* A list of the Pokémon species that have this shape. */
    List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>()
}
