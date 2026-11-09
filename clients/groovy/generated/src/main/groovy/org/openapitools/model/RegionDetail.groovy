package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.LocationSummary;
import org.openapitools.model.PokedexSummary;
import org.openapitools.model.RegionName;
import org.openapitools.model.VersionGroupSummary;

@Canonical
class RegionDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* A list of locations that can be found in this region. */
    List<LocationSummary> locations = new ArrayList<>()
    /* The generation this region was introduced in. */
    GenerationSummary mainGeneration
    /* The name of this resource listed in different languages. */
    List<RegionName> names = new ArrayList<>()
    /* A list of pokédexes that catalogue Pokémon in this region. */
    List<PokedexSummary> pokedexes = new ArrayList<>()
    /* A list of version groups where this region can be visited. */
    List<VersionGroupSummary> versionGroups = new ArrayList<>()
}
