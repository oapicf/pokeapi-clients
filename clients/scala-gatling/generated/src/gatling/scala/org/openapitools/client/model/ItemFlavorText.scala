
package org.openapitools.client.model


case class ItemFlavorText (
    /* The localized flavor text for an API resource in a specific language. */
    _text: String,
    /* The version group which uses this flavor text. */
    _versionGroup: VersionGroupSummary,
    /* The language this name is in. */
    _language: LanguageSummary
)
object ItemFlavorText {
    def toStringBody(var_text: Object, var_versionGroup: Object, var_language: Object) =
        s"""
        | {
        | "text":$var_text,"versionGroup":$var_versionGroup,"language":$var_language
        | }
        """.stripMargin
}
