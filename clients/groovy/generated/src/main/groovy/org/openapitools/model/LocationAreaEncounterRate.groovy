package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.EncounterMethodSummary;
import org.openapitools.model.LocationAreaEncounterVersionDetail;

@Canonical
class LocationAreaEncounterRate {
    /* The method in which Pokémon may be encountered in an area.. */
    EncounterMethodSummary encounterMethod
    /* The chance of the encounter to occur on a version of the game. */
    List<LocationAreaEncounterVersionDetail> versionDetails = new ArrayList<>()
}
