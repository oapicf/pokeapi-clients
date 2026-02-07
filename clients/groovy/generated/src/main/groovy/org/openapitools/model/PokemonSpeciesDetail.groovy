package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.EvolutionChainSummary;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.GrowthRateSummary;
import org.openapitools.model.PokemonColorSummary;
import org.openapitools.model.PokemonDexEntry;
import org.openapitools.model.PokemonFormDetailFormNamesInner;
import org.openapitools.model.PokemonHabitatSummary;
import org.openapitools.model.PokemonShapeSummary;
import org.openapitools.model.PokemonSpeciesDescription;
import org.openapitools.model.PokemonSpeciesDetailGeneraInner;
import org.openapitools.model.PokemonSpeciesDetailPalParkEncountersInner;
import org.openapitools.model.PokemonSpeciesDetailVarietiesInner;
import org.openapitools.model.PokemonSpeciesFlavorText;
import org.openapitools.model.PokemonSpeciesSummary;

@Canonical
class PokemonSpeciesDetail {
    
    Integer id
    
    String name
    
    Integer order
    
    Integer genderRate
    
    Integer captureRate
    
    Integer baseHappiness
    
    Boolean isBaby
    
    Boolean isLegendary
    
    Boolean isMythical
    
    Integer hatchCounter
    
    Boolean hasGenderDifferences
    
    Boolean formsSwitchable
    
    GrowthRateSummary growthRate
    
    List<PokemonDexEntry> pokedexNumbers = new ArrayList<>()
    
    List<AbilityDetailPokemonInnerPokemon> eggGroups = new ArrayList<>()
    
    PokemonColorSummary color
    
    PokemonShapeSummary shape
    
    PokemonSpeciesSummary evolvesFromSpecies
    
    EvolutionChainSummary evolutionChain
    
    PokemonHabitatSummary habitat
    
    GenerationSummary generation
    
    List<PokemonFormDetailFormNamesInner> names = new ArrayList<>()
    
    List<PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters = new ArrayList<>()
    
    List<PokemonSpeciesDescription> formDescriptions = new ArrayList<>()
    
    List<PokemonSpeciesFlavorText> flavorTextEntries = new ArrayList<>()
    
    List<PokemonSpeciesDetailGeneraInner> genera = new ArrayList<>()
    
    List<PokemonSpeciesDetailVarietiesInner> varieties = new ArrayList<>()
}
