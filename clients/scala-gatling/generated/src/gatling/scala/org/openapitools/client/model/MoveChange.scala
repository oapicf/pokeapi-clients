
package org.openapitools.client.model


case class MoveChange (
    _accuracy: Option[Integer],
    _power: Option[Integer],
    _pp: Option[Integer],
    _effectChance: Integer,
    _effectEntries: List[MoveChangeEffectEntriesInner],
    _type: TypeSummary,
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
