
package org.openapitools.client.model


case class MoveMetaCategoryDescription (
    /* The localized description for an API resource in a specific language. */
    _description: Option[String],
    /* The language this name is in. */
    _language: LanguageSummary
)
object MoveMetaCategoryDescription {
    def toStringBody(var_description: Object, var_language: Object) =
        s"""
        | {
        | "description":$var_description,"language":$var_language
        | }
        """.stripMargin
}
