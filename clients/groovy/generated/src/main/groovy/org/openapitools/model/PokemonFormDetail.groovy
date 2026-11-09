package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PokemonFormFlavorText;
import org.openapitools.model.PokemonFormName;
import org.openapitools.model.PokemonFormSprites;
import org.openapitools.model.PokemonFormTriggerCondition;
import org.openapitools.model.PokemonFormType;
import org.openapitools.model.PokemonSummary;
import org.openapitools.model.VersionGroupSummary;

@Canonical
class PokemonFormDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. */
    Integer order
    /* The order in which forms should be sorted within a species' forms. */
    Integer formOrder
    /* True for exactly one form used as the default for each Pokémon. */
    Boolean isDefault
    /* Whether or not this form can only happen during battle. */
    Boolean isBattleOnly
    /* Whether or not this form requires mega evolution. */
    Boolean isMega
    /* The name of this form. */
    String formName
    /* The Pokémon that can take on this form. */
    PokemonSummary pokemon
    /* A set of sprites used to depict this Pokémon form in the game. */
    PokemonFormSprites sprites
    /* The version group this Pokémon form was introduced in. */
    VersionGroupSummary versionGroup
    /* The form specific form name of this Pokémon form, or empty if the form does not have a specific name. */
    List<PokemonFormName> formNames = new ArrayList<>()
    /* The form specific full name of this Pokémon form, or empty if the form does not have a specific name. */
    List<PokemonFormName> names = new ArrayList<>()
    /* A list of details showing types this Pokémon form has. */
    List<PokemonFormType> types = new ArrayList<>()
    /* The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. */
    List<PokemonFormTriggerCondition> triggerConditions = new ArrayList<>()
    /* The flavor text of this form listed in different languages and versions. */
    List<PokemonFormFlavorText> flavorTextEntries = new ArrayList<>()
}
