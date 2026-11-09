package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GenerationSummary;

@Canonical
class ItemGameIndex {
    /* The internal id of an API resource within game data. */
    Integer gameIndex
    /* The generation relevent to this game index. */
    GenerationSummary generation
}
