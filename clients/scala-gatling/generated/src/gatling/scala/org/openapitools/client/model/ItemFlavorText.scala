
package org.openapitools.client.model


case class ItemFlavorText (
    _text: String,
    _versionGroup: VersionGroupSummary,
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
