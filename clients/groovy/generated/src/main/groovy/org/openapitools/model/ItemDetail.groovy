package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.ItemCategorySummary;
import org.openapitools.model.ItemDetailBabyTriggerFor;
import org.openapitools.model.ItemDetailHeldByPokemonInner;
import org.openapitools.model.ItemDetailMachinesInner;
import org.openapitools.model.ItemDetailSprites;
import org.openapitools.model.ItemEffectText;
import org.openapitools.model.ItemFlavorText;
import org.openapitools.model.ItemFlingEffectSummary;
import org.openapitools.model.ItemGameIndex;
import org.openapitools.model.ItemName;

@Canonical
class ItemDetail {
    
    Integer id
    
    String name
    
    Integer cost
    
    Integer flingPower
    
    ItemFlingEffectSummary flingEffect
    
    List<AbilityDetailPokemonInnerPokemon> attributes = new ArrayList<>()
    
    ItemCategorySummary category
    
    List<ItemEffectText> effectEntries = new ArrayList<>()
    
    List<ItemFlavorText> flavorTextEntries = new ArrayList<>()
    
    List<ItemGameIndex> gameIndices = new ArrayList<>()
    
    List<ItemName> names = new ArrayList<>()
    
    List<ItemDetailHeldByPokemonInner> heldByPokemon = new ArrayList<>()
    
    ItemDetailSprites sprites
    
    ItemDetailBabyTriggerFor babyTriggerFor
    
    List<ItemDetailMachinesInner> machines = new ArrayList<>()
}
