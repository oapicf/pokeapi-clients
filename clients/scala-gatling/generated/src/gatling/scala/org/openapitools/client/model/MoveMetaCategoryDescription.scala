
package org.openapitools.client.model


case class MoveMetaCategoryDescription (
    _description: Option[String],
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
