package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.LocationAreaEncounterDetail;
import org.openapitools.model.VersionSummary;

@Canonical
class LocationAreaPokemonEncounterVersion {
    /* The game version this encounter happens in. */
    VersionSummary version
    /* The total percentage of all encounter potential. */
    Integer maxChance
    /* A list of encounters and their specifics. */
    List<LocationAreaEncounterDetail> encounterDetails = new ArrayList<>()
}
