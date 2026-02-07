package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AbilityChange;
import org.openapitools.model.AbilityDetailPokemonInner;
import org.openapitools.model.AbilityEffectText;
import org.openapitools.model.AbilityFlavorText;
import org.openapitools.model.AbilityName;
import org.openapitools.model.GenerationSummary;

@Canonical
class AbilityDetail {
    
    Integer id
    
    String name
    
    Boolean isMainSeries
    
    GenerationSummary generation
    
    List<AbilityName> names = new ArrayList<>()
    
    List<AbilityEffectText> effectEntries = new ArrayList<>()
    
    List<AbilityChange> effectChanges = new ArrayList<>()
    
    List<AbilityFlavorText> flavorTextEntries = new ArrayList<>()
    
    List<AbilityDetailPokemonInner> pokemon = new ArrayList<>()
}
