
package org.openapitools.client.model


case class AbilityChange (
    _versionGroup: VersionGroupSummary,
    _effectEntries: List[AbilityChangeEffectText]
)
object AbilityChange {
    def toStringBody(var_versionGroup: Object, var_effectEntries: Object) =
        s"""
        | {
        | "versionGroup":$var_versionGroup,"effectEntries":$var_effectEntries
        | }
        """.stripMargin
}
