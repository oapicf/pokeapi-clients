package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EggGroupSummary;
import org.openapitools.model.EvolutionChainSummary;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.GrowthRateSummary;
import org.openapitools.model.PokemonColorSummary;
import org.openapitools.model.PokemonDexEntry;
import org.openapitools.model.PokemonHabitatSummary;
import org.openapitools.model.PokemonShapeSummary;
import org.openapitools.model.PokemonSpeciesDescription;
import org.openapitools.model.PokemonSpeciesFlavorText;
import org.openapitools.model.PokemonSpeciesGenus;
import org.openapitools.model.PokemonSpeciesName;
import org.openapitools.model.PokemonSpeciesPalParkEncounter;
import org.openapitools.model.PokemonSpeciesSummary;
import org.openapitools.model.PokemonSpeciesVariety;

@Canonical
class PokemonSpeciesDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage. */
    Integer order
    /* The chance of this Pokémon being female, in eighths; or -1 for genderless. */
    Integer genderRate
    /* The base capture rate; up to 255. The higher the number, the easier the catch. */
    Integer captureRate
    /* The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon. */
    Integer baseHappiness
    /* Whether or not this is a baby Pokémon. */
    Boolean isBaby
    /* Whether or not this is a legendary Pokémon. */
    Boolean isLegendary
    /* Whether or not this is a mythical Pokémon. */
    Boolean isMythical
    /* Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long. */
    Integer hatchCounter
    /* Whether or not this Pokémon has visual gender differences. */
    Boolean hasGenderDifferences
    /* Whether or not this Pokémon has multiple forms and can switch between them. */
    Boolean formsSwitchable
    /* The rate at which this Pokémon species gains levels. */
    GrowthRateSummary growthRate
    /* A list of Pokedexes and the indexes reserved within them for this Pokémon species. */
    List<PokemonDexEntry> pokedexNumbers = new ArrayList<>()
    /* A list of egg groups this Pokémon species is a member of. */
    List<EggGroupSummary> eggGroups = new ArrayList<>()
    /* The color of this Pokémon for Pokédex search. */
    PokemonColorSummary color
    /* The shape of this Pokémon for Pokédex search. */
    PokemonShapeSummary shape
    /* The Pokémon species that evolves into this Pokemon_species. */
    PokemonSpeciesSummary evolvesFromSpecies
    /* The evolution chain this Pokémon species is a member of. */
    EvolutionChainSummary evolutionChain
    /* The habitat this Pokémon species can be encountered in. */
    PokemonHabitatSummary habitat
    /* The generation this Pokémon species was introduced in. */
    GenerationSummary generation
    /* The name of this resource listed in different languages. */
    List<PokemonSpeciesName> names = new ArrayList<>()
    /* A list of encounters that can be had with this Pokémon species in pal park. */
    List<PokemonSpeciesPalParkEncounter> palParkEncounters = new ArrayList<>()
    /* Descriptions of different forms Pokémon take on within the Pokémon species. */
    List<PokemonSpeciesDescription> formDescriptions = new ArrayList<>()
    /* A list of flavor text entries for this Pokémon species. */
    List<PokemonSpeciesFlavorText> flavorTextEntries = new ArrayList<>()
    /* The genus of this Pokémon species listed in multiple languages. */
    List<PokemonSpeciesGenus> genera = new ArrayList<>()
    /* A list of the Pokémon that exist within this Pokémon species. */
    List<PokemonSpeciesVariety> varieties = new ArrayList<>()
}
