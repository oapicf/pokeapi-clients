
package org.openapitools.client.model


case class MoveChange (
    /* The percent value of how likely this move is to be successful. */
    _accuracy: Option[Integer],
    /* The base power before the listed version group, or null if power did not change. */
    _power: Option[Integer],
    /* Power points. The number of times this move can be used. */
    _pp: Option[Integer],
    /* The percent value of how likely it is this moves effect will take effect. */
    _effectChance: Integer,
    /* The effect of this move listed in different languages. */
    _effectEntries: List[MoveEffectEffectText],
    /* The elemental type of this move. */
    _type: TypeSummary,
    /* The version group in which these move stat values were in effect. */
    _versionGroup: VersionGroupSummary
)
object MoveChange {
    def toStringBody(var_accuracy: Object, var_power: Object, var_pp: Object, var_effectChance: Object, var_effectEntries: Object, var_type: Object, var_versionGroup: Object) =
        s"""
        | {
        | "accuracy":$var_accuracy,"power":$var_power,"pp":$var_pp,"effectChance":$var_effectChance,"effectEntries":$var_effectEntries,"type":$var_type,"versionGroup":$var_versionGroup
        | }
        """.stripMargin
}
