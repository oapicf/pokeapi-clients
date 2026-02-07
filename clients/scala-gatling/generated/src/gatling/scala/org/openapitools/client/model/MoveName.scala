
package org.openapitools.client.model


case class MoveName (
    _name: String,
    _language: LanguageSummary
)
object MoveName {
    def toStringBody(var_name: Object, var_language: Object) =
        s"""
        | {
        | "name":$var_name,"language":$var_language
        | }
        """.stripMargin
}
