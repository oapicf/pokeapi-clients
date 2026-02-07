package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.openapitools.model.AbilityName;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.MoveDamageClassSummary;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.TypeDetailDamageRelations;
import org.openapitools.model.TypeDetailPastDamageRelationsInner;
import org.openapitools.model.TypeDetailPokemonInner;
import org.openapitools.model.TypeDetailSpritesValueValue;
import org.openapitools.model.TypeGameIndex;

@Canonical
class TypeDetail {
    
    Integer id
    
    String name
    
    TypeDetailDamageRelations damageRelations
    
    List<TypeDetailPastDamageRelationsInner> pastDamageRelations = new ArrayList<>()
    
    List<TypeGameIndex> gameIndices = new ArrayList<>()
    
    GenerationSummary generation
    
    MoveDamageClassSummary moveDamageClass
    
    List<AbilityName> names = new ArrayList<>()
    
    List<TypeDetailPokemonInner> pokemon = new ArrayList<>()
    
    List<MoveSummary> moves = new ArrayList<>()
    
    Map<String, Map<String, TypeDetailSpritesValueValue>> sprites = new HashMap<>()
}
