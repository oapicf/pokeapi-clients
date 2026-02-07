package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PokemonDetailTypesInner;
import org.openapitools.model.PokemonFormDetailFormNamesInner;
import org.openapitools.model.PokemonFormDetailSprites;
import org.openapitools.model.PokemonSummary;
import org.openapitools.model.VersionGroupSummary;

@Canonical
class PokemonFormDetail {
    
    Integer id
    
    String name
    
    Integer order
    
    Integer formOrder
    
    Boolean isDefault
    
    Boolean isBattleOnly
    
    Boolean isMega
    
    String formName
    
    PokemonSummary pokemon
    
    PokemonFormDetailSprites sprites
    
    VersionGroupSummary versionGroup
    
    List<PokemonFormDetailFormNamesInner> formNames = new ArrayList<>()
    
    List<PokemonFormDetailFormNamesInner> names = new ArrayList<>()
    
    List<PokemonDetailTypesInner> types = new ArrayList<>()
}
