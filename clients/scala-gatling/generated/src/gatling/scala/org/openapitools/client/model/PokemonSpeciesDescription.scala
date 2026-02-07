
package org.openapitools.client.model


case class PokemonSpeciesDescription (
    _description: Option[String],
    _language: LanguageSummary
)
object PokemonSpeciesDescription {
    def toStringBody(var_description: Object, var_language: Object) =
        s"""
        | {
        | "description":$var_description,"language":$var_language
        | }
        """.stripMargin
}
