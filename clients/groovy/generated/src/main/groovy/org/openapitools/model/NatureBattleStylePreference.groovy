package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MoveBattleStyleSummary;

@Canonical
class NatureBattleStylePreference {
    /* Chance of using the move, in percent, if HP is under one half. */
    Integer lowHpPreference
    /* Chance of using the move, in percent, if HP is over one half. */
    Integer highHpPreference
    /* The move battle style. */
    MoveBattleStyleSummary moveBattleStyle
}
