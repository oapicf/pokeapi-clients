
package org.openapitools.client.model


case class MoveFlavorText (
    /* The localized flavor text for an api resource in a specific language. */
    _flavorText: String,
    /* The language this name is in. */
    _language: LanguageSummary,
    /* The version group that uses this flavor text. */
    _versionGroup: VersionGroupSummary
)
object MoveFlavorText {
    def toStringBody(var_flavorText: Object, var_language: Object, var_versionGroup: Object) =
        s"""
        | {
        | "flavorText":$var_flavorText,"language":$var_language,"versionGroup":$var_versionGroup
        | }
        """.stripMargin
}
