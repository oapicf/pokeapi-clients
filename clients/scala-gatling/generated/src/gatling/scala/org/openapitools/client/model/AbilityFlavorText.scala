
package org.openapitools.client.model


case class AbilityFlavorText (
    /* The localized name for an API resource in a specific language. */
    _flavorText: String,
    /* The language this text resource is in. */
    _language: LanguageSummary,
    /* The version group that uses this flavor text. */
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
