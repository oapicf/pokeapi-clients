
package org.openapitools.client.model


case class AbilityChange (
    /* The version group in which the previous effect of this ability originated. */
    _versionGroup: VersionGroupSummary,
    /* The previous effect of this ability listed in different languages. */
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
