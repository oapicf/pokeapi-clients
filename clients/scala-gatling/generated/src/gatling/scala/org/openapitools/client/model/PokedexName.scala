
package org.openapitools.client.model


case class PokedexName (
    _name: String,
    _language: LanguageSummary
)
object PokedexName {
    def toStringBody(var_name: Object, var_language: Object) =
        s"""
        | {
        | "name":$var_name,"language":$var_language
        | }
        """.stripMargin
}
