package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import org.openapitools.model.PokemonFormSummary;

@Canonical
class PokemonFormTriggerCondition {
    /* The trigger for this form change. */
    String trigger
    /* The name of the required item, ability, or move. Only present for a resource-based trigger. */
    String name
    /* The URL of the required item, ability, or move. Only present for a resource-based trigger. */
    URI url
    /* The required base form. Only present when the trigger specifies one. */
    PokemonFormSummary baseForm
}
