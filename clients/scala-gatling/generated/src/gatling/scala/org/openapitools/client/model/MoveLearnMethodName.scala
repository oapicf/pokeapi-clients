
package org.openapitools.client.model


case class MoveLearnMethodName (
    _name: String,
    _language: LanguageSummary
)
object MoveLearnMethodName {
    def toStringBody(var_name: Object, var_language: Object) =
        s"""
        | {
        | "name":$var_name,"language":$var_language
        | }
        """.stripMargin
}
