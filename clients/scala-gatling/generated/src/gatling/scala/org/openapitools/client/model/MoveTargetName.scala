
package org.openapitools.client.model


case class MoveTargetName (
    _name: String,
    _language: LanguageSummary
)
object MoveTargetName {
    def toStringBody(var_name: Object, var_language: Object) =
        s"""
        | {
        | "name":$var_name,"language":$var_language
        | }
        """.stripMargin
}
