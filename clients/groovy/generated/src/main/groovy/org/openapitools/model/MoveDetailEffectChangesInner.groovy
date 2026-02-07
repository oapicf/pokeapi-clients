package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.MoveDetailEffectChangesInnerEffectEntriesInner;

@Canonical
class MoveDetailEffectChangesInner {
    
    List<MoveDetailEffectChangesInnerEffectEntriesInner> effectEntries = new ArrayList<>()
    
    AbilityDetailPokemonInnerPokemon versionGroup
}
