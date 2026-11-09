package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;

@Canonical
class MoveEffectEffectText {
    /* The localized effect text for an API resource in a specific language. */
    String effect
    /* The localized effect text in brief. */
    String shortEffect
    /* The language this effect is in. */
    LanguageSummary language
}
