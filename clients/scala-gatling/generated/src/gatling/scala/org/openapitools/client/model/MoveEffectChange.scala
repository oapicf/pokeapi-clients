
package org.openapitools.client.model


case class MoveEffectChange (
    /* The version group in which the previous effect of this ability originated. */
    _versionGroup: VersionGroupSummary,
    /* The previous effect of this ability listed in different languages. */
    _effectEntries: List[MoveEffectChangeEffectText]
)
object MoveEffectChange {
    def toStringBody(var_versionGroup: Object, var_effectEntries: Object) =
        s"""
        | {
        | "versionGroup":$var_versionGroup,"effectEntries":$var_effectEntries
        | }
        """.stripMargin
}
