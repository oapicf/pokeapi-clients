package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.EncounterConditionValueSummary;
import org.openapitools.model.EncounterMethodSummary;
import org.openapitools.model.EncounterPokemonDetail;

@Canonical
class LocationAreaEncounterDetail {
    /* The lowest level the Pokémon could be encountered at. */
    Integer minLevel
    /* The highest level the Pokémon could be encountered at. */
    Integer maxLevel
    /* Percent chance that this encounter will occur. */
    Integer chance = 0
    /* The method by which this encounter happens. */
    EncounterMethodSummary method
    /* A list of condition values that must be in effect for this encounter to occur. */
    List<EncounterConditionValueSummary> conditionValues = new ArrayList<>()
    /* Additional properties of the encountered Pokémon, or null if unspecified. */
    EncounterPokemonDetail pokemonDetails
}
