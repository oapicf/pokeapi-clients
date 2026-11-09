
package org.openapitools.client.model


case class MoveMeta (
    /* The status ailment this move inflicts on its target. */
    _ailment: MoveMetaAilmentSummary,
    /* The category of move this move falls under, e.g. damage or ailment. */
    _category: MoveMetaCategorySummary,
    /* The minimum number of times this move hits. Null if it always only hits once. */
    _minHits: Option[Integer],
    /* The maximum number of times this move hits. Null if it always only hits once. */
    _maxHits: Option[Integer],
    /* The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. */
    _minTurns: Option[Integer],
    /* The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. */
    _maxTurns: Option[Integer],
    /* HP drain (if positive) or Recoil damage (if negative), in percent of damage done. */
    _drain: Option[Integer],
    /* The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP. */
    _healing: Option[Integer],
    /* Critical hit rate bonus. */
    _critRate: Option[Integer],
    /* The likelihood this attack will cause an ailment. */
    _ailmentChance: Option[Integer],
    /* The likelihood this attack will cause the target Pokémon to flinch. */
    _flinchChance: Option[Integer],
    /* The likelihood this attack will cause a stat change in the target Pokémon. */
    _statChance: Option[Integer]
)
object MoveMeta {
    def toStringBody(var_ailment: Object, var_category: Object, var_minHits: Object, var_maxHits: Object, var_minTurns: Object, var_maxTurns: Object, var_drain: Object, var_healing: Object, var_critRate: Object, var_ailmentChance: Object, var_flinchChance: Object, var_statChance: Object) =
        s"""
        | {
        | "ailment":$var_ailment,"category":$var_category,"minHits":$var_minHits,"maxHits":$var_maxHits,"minTurns":$var_minTurns,"maxTurns":$var_maxTurns,"drain":$var_drain,"healing":$var_healing,"critRate":$var_critRate,"ailmentChance":$var_ailmentChance,"flinchChance":$var_flinchChance,"statChance":$var_statChance
        | }
        """.stripMargin
}
