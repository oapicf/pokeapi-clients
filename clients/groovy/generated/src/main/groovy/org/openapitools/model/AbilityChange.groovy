package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AbilityChangeEffectText;
import org.openapitools.model.VersionGroupSummary;

@Canonical
class AbilityChange {
    /* The version group in which the previous effect of this ability originated. */
    VersionGroupSummary versionGroup
    /* The previous effect of this ability listed in different languages. */
    List<AbilityChangeEffectText> effectEntries = new ArrayList<>()
}
