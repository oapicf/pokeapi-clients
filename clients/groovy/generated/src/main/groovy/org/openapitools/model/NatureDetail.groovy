package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BerryFlavorSummary;
import org.openapitools.model.BerrySummary;
import org.openapitools.model.NatureBattleStylePreference;
import org.openapitools.model.NatureDetailPokeathlonStatChangesInner;
import org.openapitools.model.NatureName;
import org.openapitools.model.StatSummary;

@Canonical
class NatureDetail {
    
    Integer id
    
    String name
    
    StatSummary decreasedStat
    
    StatSummary increasedStat
    
    BerryFlavorSummary likesFlavor
    
    BerryFlavorSummary hatesFlavor
    
    List<BerrySummary> berries = new ArrayList<>()
    
    List<NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges = new ArrayList<>()
    
    List<NatureBattleStylePreference> moveBattleStylePreferences = new ArrayList<>()
    
    List<NatureName> names = new ArrayList<>()
}
