package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveMetaAilmentSummary;
import org.openapitools.model.MoveMetaCategorySummary;

@Canonical
class MoveMeta {
    
    MoveMetaAilmentSummary ailment
    
    MoveMetaCategorySummary category
    
    Integer minHits
    
    Integer maxHits
    
    Integer minTurns
    
    Integer maxTurns
    
    Integer drain
    
    Integer healing
    
    Integer critRate
    
    Integer ailmentChance
    
    Integer flinchChance
    
    Integer statChance
}
