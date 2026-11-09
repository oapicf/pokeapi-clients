package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveEffectEffectText;
import org.openapitools.model.TypeSummary;
import org.openapitools.model.VersionGroupSummary;

@Canonical
class MoveChange {
    /* The percent value of how likely this move is to be successful. */
    Integer accuracy
    /* The base power before the listed version group, or null if power did not change. */
    Integer power
    /* Power points. The number of times this move can be used. */
    Integer pp
    /* The percent value of how likely it is this moves effect will take effect. */
    Integer effectChance
    /* The effect of this move listed in different languages. */
    List<MoveEffectEffectText> effectEntries = new ArrayList<>()
    /* The elemental type of this move. */
    TypeSummary type
    /* The version group in which these move stat values were in effect. */
    VersionGroupSummary versionGroup
}
