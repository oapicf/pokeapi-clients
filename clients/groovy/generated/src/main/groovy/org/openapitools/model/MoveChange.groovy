package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveChangeEffectEntriesInner;
import org.openapitools.model.TypeSummary;
import org.openapitools.model.VersionGroupSummary;

@Canonical
class MoveChange {
    
    Integer accuracy
    
    Integer power
    
    Integer pp
    
    Integer effectChance
    
    List<MoveChangeEffectEntriesInner> effectEntries = new ArrayList<>()
    
    TypeSummary type
    
    VersionGroupSummary versionGroup
}
