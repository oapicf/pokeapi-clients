package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveLearnMethodSummary;
import org.openapitools.model.VersionGroupSummary;

@Canonical
class PokemonMoveVersionGroup {
    /* The minimum level to learn the move. */
    Integer levelLearnedAt
    /* The method by which the move is learned. */
    MoveLearnMethodSummary moveLearnMethod
    /* The version group in which the move is learned. */
    VersionGroupSummary versionGroup
    /* Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order. */
    Integer order
}
