package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;
import org.openapitools.model.VersionGroupSummary;

@Canonical
class ItemFlavorText {
    /* The localized flavor text for an API resource in a specific language. */
    String text
    /* The version group which uses this flavor text. */
    VersionGroupSummary versionGroup
    /* The language this name is in. */
    LanguageSummary language
}
