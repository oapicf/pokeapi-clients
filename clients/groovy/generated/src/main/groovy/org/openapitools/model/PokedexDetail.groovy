package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PokedexDescription;
import org.openapitools.model.PokedexName;
import org.openapitools.model.PokemonDexNumber;
import org.openapitools.model.RegionSummary;
import org.openapitools.model.VersionGroupSummary;

@Canonical
class PokedexDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* Whether or not this Pokédex originated in the main series of the video games. */
    Boolean isMainSeries
    /* The description of this resource listed in different languages. */
    List<PokedexDescription> descriptions = new ArrayList<>()
    /* The name of this resource listed in different languages. */
    List<PokedexName> names = new ArrayList<>()
    /* A list of Pokémon catalogued in this Pokédex and their indexes. */
    List<PokemonDexNumber> pokemonEntries = new ArrayList<>()
    /* The region this Pokédex catalogues Pokémon for. */
    RegionSummary region
    /* A list of version groups this Pokédex is relevant to. */
    List<VersionGroupSummary> versionGroups = new ArrayList<>()
}
