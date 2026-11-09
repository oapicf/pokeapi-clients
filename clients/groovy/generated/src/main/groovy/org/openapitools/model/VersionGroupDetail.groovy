package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.MoveLearnMethodSummary;
import org.openapitools.model.PokedexSummary;
import org.openapitools.model.RegionSummary;
import org.openapitools.model.VersionSummary;

@Canonical
class VersionGroupDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* Order for sorting. Almost by date of release, except similar versions are grouped together. */
    Integer order
    /* The generation this version was introduced in. */
    GenerationSummary generation
    /* A list of methods in which Pokémon can learn moves in this version group. */
    List<MoveLearnMethodSummary> moveLearnMethods = new ArrayList<>()
    /* A list of Pokédexes introduces in this version group. */
    List<PokedexSummary> pokedexes = new ArrayList<>()
    /* A list of regions that can be visited in this version group. */
    List<RegionSummary> regions = new ArrayList<>()
    /* The versions this version group owns. */
    List<VersionSummary> versions = new ArrayList<>()
}
