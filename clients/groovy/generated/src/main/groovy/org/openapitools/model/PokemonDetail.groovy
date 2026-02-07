package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PokemonDetailAbilitiesInner;
import org.openapitools.model.PokemonDetailCries;
import org.openapitools.model.PokemonDetailHeldItems;
import org.openapitools.model.PokemonDetailMovesInner;
import org.openapitools.model.PokemonDetailPastAbilitiesInner;
import org.openapitools.model.PokemonDetailPastTypesInner;
import org.openapitools.model.PokemonDetailSprites;
import org.openapitools.model.PokemonDetailTypesInner;
import org.openapitools.model.PokemonFormSummary;
import org.openapitools.model.PokemonGameIndex;
import org.openapitools.model.PokemonSpeciesSummary;
import org.openapitools.model.PokemonStat;

@Canonical
class PokemonDetail {
    
    Integer id
    
    String name
    
    Integer baseExperience
    
    Integer height
    
    Boolean isDefault
    
    Integer order
    
    Integer weight
    
    List<PokemonDetailAbilitiesInner> abilities = new ArrayList<>()
    
    List<PokemonDetailPastAbilitiesInner> pastAbilities = new ArrayList<>()
    
    List<PokemonFormSummary> forms = new ArrayList<>()
    
    List<PokemonGameIndex> gameIndices = new ArrayList<>()
    
    PokemonDetailHeldItems heldItems
    
    String locationAreaEncounters
    
    List<PokemonDetailMovesInner> moves = new ArrayList<>()
    
    PokemonSpeciesSummary species
    
    PokemonDetailSprites sprites
    
    PokemonDetailCries cries
    
    List<PokemonStat> stats = new ArrayList<>()
    
    List<PokemonDetailTypesInner> types = new ArrayList<>()
    
    List<PokemonDetailPastTypesInner> pastTypes = new ArrayList<>()
}
