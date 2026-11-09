package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveMetaAilmentSummary;
import org.openapitools.model.MoveMetaCategorySummary;

@Canonical
class MoveMeta {
    /* The status ailment this move inflicts on its target. */
    MoveMetaAilmentSummary ailment
    /* The category of move this move falls under, e.g. damage or ailment. */
    MoveMetaCategorySummary category
    /* The minimum number of times this move hits. Null if it always only hits once. */
    Integer minHits
    /* The maximum number of times this move hits. Null if it always only hits once. */
    Integer maxHits
    /* The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. */
    Integer minTurns
    /* The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. */
    Integer maxTurns
    /* HP drain (if positive) or Recoil damage (if negative), in percent of damage done. */
    Integer drain
    /* The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP. */
    Integer healing
    /* Critical hit rate bonus. */
    Integer critRate
    /* The likelihood this attack will cause an ailment. */
    Integer ailmentChance
    /* The likelihood this attack will cause the target Pokémon to flinch. */
    Integer flinchChance
    /* The likelihood this attack will cause a stat change in the target Pokémon. */
    Integer statChance
}
