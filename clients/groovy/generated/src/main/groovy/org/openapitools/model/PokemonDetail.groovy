package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PokemonAbility;
import org.openapitools.model.PokemonCries;
import org.openapitools.model.PokemonFormSummary;
import org.openapitools.model.PokemonGameIndex;
import org.openapitools.model.PokemonHeldItemSummary;
import org.openapitools.model.PokemonMove;
import org.openapitools.model.PokemonPastAbility;
import org.openapitools.model.PokemonPastStat;
import org.openapitools.model.PokemonPastType;
import org.openapitools.model.PokemonSpeciesSummary;
import org.openapitools.model.PokemonSprites;
import org.openapitools.model.PokemonStat;
import org.openapitools.model.PokemonType;

@Canonical
class PokemonDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The base experience gained for defeating this Pokémon. */
    Integer baseExperience
    /* The height of this Pokémon in decimetres. */
    Integer height
    /* Set for exactly one Pokémon used as the default for each species. */
    Boolean isDefault
    /* Order for sorting. Almost national order, except families are grouped together. */
    Integer order
    /* The weight of this Pokémon in hectograms. */
    Integer weight
    /* A list of abilities this Pokémon could potentially have. */
    List<PokemonAbility> abilities = new ArrayList<>()
    /* A list of details showing abilities this pokémon had in previous generations */
    List<PokemonPastAbility> pastAbilities = new ArrayList<>()
    /* A list of forms this Pokémon can take on. */
    List<PokemonFormSummary> forms = new ArrayList<>()
    /* A list of game indices relevent to Pokémon item by generation. */
    List<PokemonGameIndex> gameIndices = new ArrayList<>()
    /* A list of items this Pokémon may be holding when encountered. */
    List<PokemonHeldItemSummary> heldItems = new ArrayList<>()
    /* A link to a list of location areas, as well as encounter details pertaining to specific versions. */
    String locationAreaEncounters
    /* A list of moves along with learn methods and level details pertaining to specific version groups. */
    List<PokemonMove> moves = new ArrayList<>()
    /* The species this Pokémon belongs to. */
    PokemonSpeciesSummary species
    /* A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a> */
    PokemonSprites sprites
    /* A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a> */
    PokemonCries cries
    /* A list of base stat values for this Pokémon. */
    List<PokemonStat> stats = new ArrayList<>()
    /* A list of details showing stats this pokémon had in previous generations */
    List<PokemonPastStat> pastStats = new ArrayList<>()
    /* A list of details showing types this Pokémon has. */
    List<PokemonType> types = new ArrayList<>()
    /* A list of details showing types this pokémon had in previous generations */
    List<PokemonPastType> pastTypes = new ArrayList<>()
}
