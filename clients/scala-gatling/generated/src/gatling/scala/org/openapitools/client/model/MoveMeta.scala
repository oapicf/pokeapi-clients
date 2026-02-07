
package org.openapitools.client.model


case class MoveMeta (
    _ailment: MoveMetaAilmentSummary,
    _category: MoveMetaCategorySummary,
    _minHits: Option[Integer],
    _maxHits: Option[Integer],
    _minTurns: Option[Integer],
    _maxTurns: Option[Integer],
    _drain: Option[Integer],
    _healing: Option[Integer],
    _critRate: Option[Integer],
    _ailmentChance: Option[Integer],
    _flinchChance: Option[Integer],
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
