package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.TypeRelationships;

@Canonical
class TypePastRelationships {
    /* The last generation in which the referenced type had the listed damage relations */
    GenerationSummary generation
    /* The damage relations the referenced type had up to and including the listed generation */
    TypeRelationships damageRelations
}
