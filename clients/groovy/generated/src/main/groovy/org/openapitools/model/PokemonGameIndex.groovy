package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.VersionSummary;

@Canonical
class PokemonGameIndex {
    /* The internal id of an API resource within game data. */
    Integer gameIndex
    /* The version relevent to this game index. */
    VersionSummary version
}
