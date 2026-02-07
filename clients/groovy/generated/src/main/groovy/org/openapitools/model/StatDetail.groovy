package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CharacteristicSummary;
import org.openapitools.model.MoveDamageClassSummary;
import org.openapitools.model.StatDetailAffectingMoves;
import org.openapitools.model.StatDetailAffectingNatures;
import org.openapitools.model.StatName;

@Canonical
class StatDetail {
    
    Integer id
    
    String name
    
    Integer gameIndex
    
    Boolean isBattleOnly
    
    StatDetailAffectingMoves affectingMoves
    
    StatDetailAffectingNatures affectingNatures
    
    List<CharacteristicSummary> characteristics = new ArrayList<>()
    
    MoveDamageClassSummary moveDamageClass
    
    List<StatName> names = new ArrayList<>()
}
