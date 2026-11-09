package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AbilityChange;
import org.openapitools.model.AbilityEffectText;
import org.openapitools.model.AbilityFlavorText;
import org.openapitools.model.AbilityName;
import org.openapitools.model.AbilityPokemonDetail;
import org.openapitools.model.GenerationSummary;

@Canonical
class AbilityDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* Whether or not this ability originated in the main series of the video games. */
    Boolean isMainSeries
    /* The generation this ability originated in. */
    GenerationSummary generation
    /* The name of this resource listed in different languages. */
    List<AbilityName> names = new ArrayList<>()
    /* The effect of this ability listed in different languages. */
    List<AbilityEffectText> effectEntries = new ArrayList<>()
    /* The list of previous effects this ability has had across version groups. */
    List<AbilityChange> effectChanges = new ArrayList<>()
    /* The flavor text of this ability listed in different languages. */
    List<AbilityFlavorText> flavorTextEntries = new ArrayList<>()
    /* A list of Pokémon that could potentially have this ability. */
    List<AbilityPokemonDetail> pokemon = new ArrayList<>()
}
