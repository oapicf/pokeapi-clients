package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;
import org.openapitools.model.VersionGroupSummary;

@Canonical
class AbilityFlavorText {
    /* The localized name for an API resource in a specific language. */
    String flavorText
    /* The language this text resource is in. */
    LanguageSummary language
    /* The version group that uses this flavor text. */
    VersionGroupSummary versionGroup
}
