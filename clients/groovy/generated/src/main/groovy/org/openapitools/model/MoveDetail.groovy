package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.ContestEffectSummary;
import org.openapitools.model.ContestTypeSummary;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.MoveChange;
import org.openapitools.model.MoveChangeEffectEntriesInner;
import org.openapitools.model.MoveDamageClassSummary;
import org.openapitools.model.MoveDetailContestCombos;
import org.openapitools.model.MoveDetailEffectChangesInner;
import org.openapitools.model.MoveDetailMachinesInner;
import org.openapitools.model.MoveDetailStatChangesInner;
import org.openapitools.model.MoveFlavorText;
import org.openapitools.model.MoveMeta;
import org.openapitools.model.MoveName;
import org.openapitools.model.MoveTargetSummary;
import org.openapitools.model.SuperContestEffectSummary;
import org.openapitools.model.TypeSummary;

@Canonical
class MoveDetail {
    
    Integer id
    
    String name
    
    Integer accuracy
    
    Integer effectChance
    
    Integer pp
    
    Integer priority
    
    Integer power
    
    MoveDetailContestCombos contestCombos
    
    ContestTypeSummary contestType
    
    ContestEffectSummary contestEffect
    
    MoveDamageClassSummary damageClass
    
    List<MoveChangeEffectEntriesInner> effectEntries = new ArrayList<>()
    
    List<MoveDetailEffectChangesInner> effectChanges = new ArrayList<>()
    
    GenerationSummary generation
    
    MoveMeta meta
    
    List<MoveName> names = new ArrayList<>()
    
    List<MoveChange> pastValues = new ArrayList<>()
    
    List<MoveDetailStatChangesInner> statChanges = new ArrayList<>()
    
    SuperContestEffectSummary superContestEffect
    
    MoveTargetSummary target
    
    TypeSummary type
    
    List<MoveDetailMachinesInner> machines = new ArrayList<>()
    
    List<MoveFlavorText> flavorTextEntries = new ArrayList<>()
    
    List<AbilityDetailPokemonInnerPokemon> learnedByPokemon = new ArrayList<>()
}
