package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.ItemAttributeDescription;
import org.openapitools.model.ItemAttributeName;

@Canonical
class ItemAttributeDetail {
    
    Integer id
    
    String name
    
    List<ItemAttributeDescription> descriptions = new ArrayList<>()
    
    List<AbilityDetailPokemonInnerPokemon> items = new ArrayList<>()
    
    List<ItemAttributeName> names = new ArrayList<>()
}
