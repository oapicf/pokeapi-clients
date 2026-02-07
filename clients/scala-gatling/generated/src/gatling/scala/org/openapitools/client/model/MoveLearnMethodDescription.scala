
package org.openapitools.client.model


case class MoveLearnMethodDescription (
    _description: Option[String],
    _language: LanguageSummary
)
object MoveLearnMethodDescription {
    def toStringBody(var_description: Object, var_language: Object) =
        s"""
        | {
        | "description":$var_description,"language":$var_language
        | }
        """.stripMargin
}
