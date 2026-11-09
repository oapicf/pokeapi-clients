package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;

@Canonical
class SuperContestEffectFlavorText {
    /* The localized flavor text for an API resource in a specific language. */
    String flavorText
    /* The language this name is in. */
    LanguageSummary language
}
