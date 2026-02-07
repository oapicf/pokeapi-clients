
package org.openapitools.client.model


case class AbilityFlavorText (
    _flavorText: String,
    _language: LanguageSummary,
    _versionGroup: VersionGroupSummary
)
object AbilityFlavorText {
    def toStringBody(var_flavorText: Object, var_language: Object, var_versionGroup: Object) =
        s"""
        | {
        | "flavorText":$var_flavorText,"language":$var_language,"versionGroup":$var_versionGroup
        | }
        """.stripMargin
}
